import java.util.ArrayList;
import java.util.Scanner;

public class SalonManagementSystem {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Appointment> appointments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nSalon Management System");
            System.out.println("1. Add Customer");
            System.out.println("2. Book Appointment");
            System.out.println("3. View Appointments");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addCustomer();
                    break;
                case 2:
                    bookAppointment();
                    break;
                case 3:
                    viewAppointments();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }

    private static void addCustomer() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        String contact = scanner.nextLine();
        customers.add(new Customer(name, contact));
        System.out.println("Customer added successfully!");
    }

    private static void bookAppointment() {
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Enter service: ");
        String service = scanner.nextLine();
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();
        appointments.add(new Appointment(name, service, date));
        System.out.println("Appointment booked successfully!");
    }

    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
        } else {
            for (Appointment appt : appointments) {
                System.out.println(appt);
            }
        }
    }
}
