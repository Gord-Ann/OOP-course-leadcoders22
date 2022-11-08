public class Main {
    public static void main(String[] args) {
        Operator max = new Operator("Tim", 20, 5);
        PRmanager min = new PRmanager("Dima", 49);
        Driver high = new Driver("Kirill", 39, 5, 8);
        Secretary boo = new Secretary("Tatyna", 4);
        Director maxis = new Director("Mariya", 21);
        DataScience look = new DataScience("Lilya", 50000, 30);
        HRmanager h = new HRmanager("Sergey", 7);
        Programmer k = new Programmer("Alice", 21);
        Accountant m = new Accountant("Kat", 4, "hgjg");
        System.out.println(h.getName());
        high.setRating(6);
        System.out.println(high.getRating());
    }

}
