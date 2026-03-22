import java.util.Scanner;

/**
 *
 * MAIN CLASS BookMyStayApp
 *
 * Use Case 9: Error Handling & Validation
 *
 * @version 9.0
 */

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Booking Validation");

        Scanner scanner = new Scanner(System.in);

        RoomInventory inventory = new RoomInventory();
        ReservationValidator validator = new ReservationValidator();
        BookingRequestQueue queue = new BookingRequestQueue();

        try {

            /*
             * Input
             */
            System.out.print("Enter guest name: ");
            String name = scanner.nextLine();

            System.out.print(
                    "Enter room type (Single/Double/Suite): ");
            String roomType = scanner.nextLine();

            /*
             * Validation
             */
            validator.validate(name, roomType, inventory);

            /*
             * Add booking request
             */
            Reservation r = new Reservation(name, roomType);
            queue.addRequest(r);

            System.out.println("Booking request accepted.");

        } catch (InvalidBookingException e) {

            System.out.println(
                    "Booking failed: " + e.getMessage()
            );

        } finally {
            scanner.close();
        }
    }
}