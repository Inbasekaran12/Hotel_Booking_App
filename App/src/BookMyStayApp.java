public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        RoomSearchService search = new RoomSearchService();

        search.searchAvailableRooms(
                inventory,single,dbl,suite);
    }
}