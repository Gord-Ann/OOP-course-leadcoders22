public class Main {
    public static void main (String [] args) {
        Place t1 = new Place("Central", "St.Petersburg", 9, 5000);
        System.out.println("District - " + t1.getDistrict());
        System.out.println("City - " + t1.getCity());
        System.out.println("Safety out of 10 - " + t1.getSafety());
        System.out.println("Price - " + t1.getPrice());

        Hospital h1 = new Hospital("Record", "present", "number");
        System.out.println("Ticket - " + h1.getTicket());
        System.out.println("Wifi - " + h1.getWifi());
        System.out.println("Cabinet - " + h1.getCabinet());

        Info i1 = new Info(10, 10, 9);
        System.out.println("Ticket Rating - " + i1.getRatingTicket());
        System.out.println("Wifi Rating - " + i1.getRatingWifi());
        System.out.println("Cabinet Rating - " + i1.getRatingCabinet());

        Patient c1 = new Patient("Pedrov", "Andrew", 11111988 , 76);
        System.out.println("Patient surname - " + c1.getSurname());
        System.out.println("Patient name - " + c1.getName());
        System.out.println("Patient birth date - " + c1.getBirthDate());
        System.out.println("Patient Id - " + c1.getPatientId());

        Insurance bon1 = new Insurance(0.23);
        System.out.println("Insurance - " + bon1.getAmount());

        Status s1 = new Status("Paid, active");
        System.out.println("Your order status - " + s1.getStatus());

        Doctor e1 = new Doctor("Petrov", "Peter", 12091989, 9768, 4959);
        System.out.println("Doctor surname - " + e1.getSurname());
        System.out.println("Doctor name - " + e1.getName());
        System.out.println("Doctor birth date - " + e1.getBirthDate());
        System.out.println("Doctor login - " + e1.getLogin());
        System.out.println("Doctor password - " + e1.getPassword());
    }
}