/**
 *
 * CLASS BookingReportService
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Generates reports from booking history.
 *
 * @version 8.3
 */

public class BookingReportService {

    /**
     * Generate report
     *
     * @param history booking history
     */
    public void generateReport(BookingHistory history) {

        System.out.println("\nBooking History Report");

        for (Reservation r :
                history.getConfirmedReservations()) {

            System.out.println(
                    "Guest: " + r.getGuestName() +
                            ", Room Type: " + r.getRoomType()
            );
        }
    }
}
