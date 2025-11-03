public class Appointment {
    private String customerName;
    private String service;
    private String date;

    public Appointment(String customerName, String service, String date) {
        this.customerName = customerName;
        this.service = service;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Appointment - Customer: " + customerName + ", Service: " + service + ", Date: " + date;
    }
}
