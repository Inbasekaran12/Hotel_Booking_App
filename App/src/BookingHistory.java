import java.util.ArrayList;
import java.util.List;

/**
 *
 * CLASS BookingHistory
 *
 * Use Case 8: Booking History & Reporting
 *
 * Description:
 * Stores confirmed bookings in order.
 *
 * @version 8.3
 */

public class BookingHistory {

    /**
     * List storing confirmed reservations
     */
    private List<Reservation> confirmedReservations;

    /**
     * Constructor
     */
    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    /**
     * Add reservation to history
     *
     * @param reservation confirmed booking
     */
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    /**
     * Get all reservations
     */
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}