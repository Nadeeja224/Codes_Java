import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "salon_data.txt";

    public static void saveData(ArrayList<Appointment> appointments) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Appointment appt : appointments) {
                writer.write(appt.toString());
                writer.newLine();
            }
            System.out.println("Data saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static void loadData(ArrayList<Appointment> appointments) {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("No previous data found.");
        }
    }
}
