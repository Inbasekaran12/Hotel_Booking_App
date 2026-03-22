public class BookMyStayApp {

    public static void main(String[] args) {

        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService service = new FilePersistenceService();

        String file = "inventory.txt";

        service.loadInventory(inventory, file);

        System.out.println("Single: " +
                inventory.getRoomAvailability().get("Single"));

        service.saveInventory(inventory, file);
    }
}