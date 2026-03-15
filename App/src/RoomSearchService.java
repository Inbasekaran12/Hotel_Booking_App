import java.util.Map;

/**
 * CLASS RoomSearchService
 *
 * Displays available rooms without modifying inventory.
 */
public class RoomSearchService {

    public void searchAvailableRooms(
            RoomInventory inventory,
            Room single,
            Room dbl,
            Room suite){

        Map<String,Integer> availability =
                inventory.getRoomAvailability();

        System.out.println("Room Search");

        if(availability.get("Single") > 0){
            System.out.println("\nSingle Room:");
            single.displayRoomDetails();
            System.out.println("Available: "+availability.get("Single"));
        }

        if(availability.get("Double") > 0){
            System.out.println("\nDouble Room:");
            dbl.displayRoomDetails();
            System.out.println("Available: "+availability.get("Double"));
        }

        if(availability.get("Suite") > 0){
            System.out.println("\nSuite Room:");
            suite.displayRoomDetails();
            System.out.println("Available: "+availability.get("Suite"));
        }
    }
}