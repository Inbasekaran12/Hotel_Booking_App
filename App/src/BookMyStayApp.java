/**
 *
 * MAIN CLASS BookMyStayApp
 *
 * Use Case 8: Booking History & Reporting
 *
 * @version 8.3
 */

public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Booking History and Reporting");

        BookingHistory history = new BookingHistory();
        BookingReportService report = new BookingReportService();

        /*
         * Simulate confirmed bookings
         */
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        /*
         * Generate report
         */
        report.generateReport(history);
    }
}