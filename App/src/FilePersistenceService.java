import java.io.*;

/**
 *
 * CLASS FilePersistenceService
 *
 * Use Case 12: Persistence
 *
 * @version 12.0
 */

public class FilePersistenceService {

    public void saveInventory(RoomInventory inventory, String filePath) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {

            for (String key : inventory.getRoomAvailability().keySet()) {

                int value = inventory.getRoomAvailability().get(key);

                writer.write(key + "-" + value);
                writer.newLine();
            }

            System.out.println("Inventory saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving file.");
        }
    }

    public void loadInventory(RoomInventory inventory, String filePath) {

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("No valid inventory data found. Starting fresh.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("-");

                inventory.updateAvailability(
                        parts[0],
                        Integer.parseInt(parts[1])
                );
            }

            System.out.println("Inventory restored.");

        } catch (Exception e) {
            System.out.println("Error loading file.");
        }
    }
}
