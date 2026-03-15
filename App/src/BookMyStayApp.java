public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("Booking Request Queue");

        BookingRequestQueue queue = new BookingRequestQueue();

        queue.addRequest(new Reservation("Abhi","Single"));
        queue.addRequest(new Reservation("Subha","Double"));
        queue.addRequest(new Reservation("Vanmathi","Suite"));

        while(queue.hasPendingRequests()){

            Reservation r = queue.getNextRequest();

            System.out.println("Processing booking for Guest: "
                    + r.getGuestName()
                    + ", Room Type: "
                    + r.getRoomType());
        }
    }
}