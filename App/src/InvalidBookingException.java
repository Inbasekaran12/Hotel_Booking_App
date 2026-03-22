/**
 *
 * CLASS InvalidBookingException
 *
 * Use Case 9: Error Handling & Validation
 *
 * @version 9.0
 */

public class InvalidBookingException extends Exception {

    public InvalidBookingException(String message) {
        super(message);
    }
}