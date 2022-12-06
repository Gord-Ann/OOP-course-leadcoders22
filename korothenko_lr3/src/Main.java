public class Main {
    public static void main (String [] args) {
        Tour t1 = new Tour("Russia", "Perm", 9, 45000);
        System.out.println("Country - " + t1.getCountry());
        System.out.println("City - " + t1.getCity());
        System.out.println("Safety out of 10 - " + t1.getSafety());
        System.out.println("Price - " + t1.getPrice());

        Building b1 = new Building("Hotel", "Center");
        System.out.println("Building - " + b1.getType());
        System.out.println("Place - " + b1.getPlace());

        House h1 = new House("Include", "include", "2 beds");
        System.out.println("Food - " + h1.getFood());
        System.out.println("Wifi - " + h1.getWifi());
        System.out.println("Room - " + h1.getRoom());

        Info i1 = new Info(10, 10, 9);
        System.out.println("Food Rating - " + i1.getRatingFood());
        System.out.println("Wifi Rating - " + i1.getRatingWifi());
        System.out.println("Room Rating - " + i1.getRatingRoom());

        Client c1 = new Client("Levov", "Igor", 12121999 , 12);
        System.out.println("Client surname - " + c1.getSurname());
        System.out.println("Client name - " + c1.getName());
        System.out.println("Client birth date - " + c1.getBirthDate());
        System.out.println("Client Id - " + c1.getClientId());

        Bonuses bon1 = new Bonuses(0.23);
        System.out.println("Bonuses - " + bon1.getAmount());

        Airplane a1 = new Airplane("Utair", 3);
        System.out.println("Company name - " + a1.getName());
        System.out.println("Travel time - " + a1.getTravelTime());

        Status s1 = new Status("Paid, active");
        System.out.println("Your order status - " + s1.getStatus());

        Employee e1 = new Employee("Bonin", "Alexey", 9121989, 9902, 1231);
        System.out.println("Employee surname - " + e1.getSurname());
        System.out.println("Employee name - " + e1.getName());
        System.out.println("Employee birth date - " + e1.getBirthDate());
        System.out.println("Employee login - " + e1.getLogin());
        System.out.println("Employee password - " +e1.getPassword());
    }
}