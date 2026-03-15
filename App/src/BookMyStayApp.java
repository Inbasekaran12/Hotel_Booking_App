public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        BookingRequestQueue queue = new BookingRequestQueue();

        queue.addRequest(new Reservation("Abhi", "Single"));
        queue.addRequest(new Reservation("Subha", "Single"));
        queue.addRequest(new Reservation("Vanmathi", "Suite"));

        RoomAllocationService allocator =
                new RoomAllocationService();

        while (queue.hasPendingRequests()) {

            Reservation r = queue.getNextRequest();

            allocator.allocateRoom(r, inventory);
        }
    }
}