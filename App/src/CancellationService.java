import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * CLASS CancellationService
 *
 * Use Case 10: Booking Cancellation
 *
 * @version 10.0
 */

public class CancellationService {

    private Stack<String> releasedRoomIds;
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    public void cancelBooking(String reservationId, RoomInventory inventory) {

        if (!reservationRoomTypeMap.containsKey(reservationId)) {
            System.out.println("Invalid cancellation request.");
            return;
        }

        String roomType = reservationRoomTypeMap.get(reservationId);

        releasedRoomIds.push(reservationId);

        int current = inventory.getRoomAvailability().get(roomType);
        inventory.updateAvailability(roomType, current + 1);

        reservationRoomTypeMap.remove(reservationId);

        System.out.println("Booking cancelled successfully for " + roomType);
    }

    public void showRollbackHistory() {
        System.out.println("Rollback History:");
        while (!releasedRoomIds.isEmpty()) {
            System.out.println(releasedRoomIds.pop());
        }
    }
}