import java.util.Map;

/**
 *
 * CLASS ReservationValidator
 *
 * Use Case 9: Error Handling & Validation
 *
 * @version 9.0
 */

public class ReservationValidator {

    public void validate(
            String guestName,
            String roomType,
            RoomInventory inventory
    ) throws InvalidBookingException {

        /*
         * Validate name
         */
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException(
                    "Guest name cannot be empty."
            );
        }

        /*
         * Validate room type
         */
        Map<String, Integer> rooms =
                inventory.getRoomAvailability();

        if (!rooms.containsKey(roomType)) {
            throw new InvalidBookingException(
                    "Invalid room type selected."
            );
        }

        /*
         * Validate availability
         */
        if (rooms.get(roomType) <= 0) {
            throw new InvalidBookingException(
                    "No rooms available."
            );
        }
    }
}