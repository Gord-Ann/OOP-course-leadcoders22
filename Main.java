public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivanov", "Oleg", 7, 9, 2002);
        System.out.println("Employee surname - " + e1.surname + "; name - " + e1.name);
        System.out.println("Employee birth day - " + e1.birthDay + "; month - " + e1.birthMonth + "; year - " + e1.birthYear);

        Tour t1 = new Tour();
        t1.inputTour();

        Info i1 = new Info();
        i1.inputInfo();

        Train tr1 = new Train("SAPSAN", 2);
        System.out.println("Your train name is - " + tr1.getName() + "; Your travel time is - " + tr1.getTravelTime() + " hours");

        Client c1 = new Client("Petrov", "Igor", 12, 12, 1989, 1);
        System.out.println("Client surname - " + c1.surname + "; name - " + c1.name);
        System.out.println("Client birth day - " + c1.birthDay + "; month - " + c1.birthMonth + "; year - " + c1.birthYear);
        System.out.println("Client Id - " + c1.getClientId());

        Status s1 = new Status();
        s1.inputStatus();

        Bonuses b1 = new Bonuses();
        b1.inputBonuses();
    }
}