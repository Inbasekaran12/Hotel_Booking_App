import java.util.LinkedList;
import java.util.Queue;

/**
 * CLASS BookingRequestQueue
 * FIFO queue for booking requests.
 */
public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue(){
        requestQueue = new LinkedList<>();
    }

    public void addRequest(Reservation r){
        requestQueue.offer(r);
    }

    public Reservation getNextRequest(){
        return requestQueue.poll();
    }

    public boolean hasPendingRequests(){
        return !requestQueue.isEmpty();
    }
}