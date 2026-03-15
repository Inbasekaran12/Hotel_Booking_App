/**
 * Use Case 3: Inventory Management
 */
public class BookMyStayApp {

    public static void main(String[] args) {

        RoomInventory inventory = new RoomInventory();

        System.out.println("Inventory Status");

        inventory.getRoomAvailability().forEach((type,count) ->
                System.out.println(type+" Rooms Available: "+count));
    }
}