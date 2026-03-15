import java.util.*;

/**
 * CLASS RoomAllocationService
 *
 * Confirms booking requests and assigns unique room IDs.
 */
public class RoomAllocationService {

    private Set<String> allocatedRoomIds;
    private Map<String,Set<String>> assignedRoomsByType;

    public RoomAllocationService(){
        allocatedRoomIds = new HashSet<>();
        assignedRoomsByType = new HashMap<>();
    }

    public void allocateRoom(Reservation reservation,
                             RoomInventory inventory){

        String roomType = reservation.getRoomType();

        int available =
                inventory.getRoomAvailability().get(roomType);

        if(available <= 0){
            System.out.println("No rooms available for "+roomType);
            return;
        }

        String roomId = generateRoomId(roomType);

        allocatedRoomIds.add(roomId);

        assignedRoomsByType
                .computeIfAbsent(roomType,k->new HashSet<>())
                .add(roomId);

        inventory.updateAvailability(roomType,available-1);

        System.out.println(
                "Booking confirmed for Guest: "
                        + reservation.getGuestName()
                        + ", Room ID: "
                        + roomId
        );
    }

    private String generateRoomId(String roomType){

        int number = 1;
        String roomId;

        do{
            roomId = roomType+"-"+number;
            number++;
        }
        while(allocatedRoomIds.contains(roomId));

        return roomId;
    }
}