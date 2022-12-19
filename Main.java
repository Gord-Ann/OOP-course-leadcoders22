public class Main {
    public static void main(String[] args) {
        Client c1 = new Client();
        c1.inputClient();

        Tour t1 = new Tour();
        t1.inputTour();

        Info i1 = new Info();
        i1.inputInfo();

        Train tr1 = new Train("SAPSAN", 2);
        System.out.println("Your train name is - " + tr1.getName() + "; Your travel time is - " + tr1.getTravelTime() + " hours");

        Employee e1 = new Employee();
        e1.inputEmployee();

        Status s1 = new Status();
        s1.inputStatus();

        Bonuses b1 = new Bonuses();
        b1.inputBonuses();
    }
}

