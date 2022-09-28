package ru.pgups.sumarokova;

public class Work {

    private String name;
    private String day;

    public Work(String name, String day) {
        this.name = name;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
    class  MainWork {

        public static void main(String[] args) {
            Work A = new Work("number 1", "2/2");
            System.out.println("Name: " + A.getName());
            System.out.println("Shift: " + A.getDay() + "days");

            Work B = new Work("number 1", "3/1");
            System.out.println("Name: " + A.getName());
            System.out.println("Shift: " + A.getDay() + "days");

            System.out.println("    The data has been changed");

            A.setName("number 22");
            System.out.println("Name: " + A.getName());

            A.setDay("3/2");
            System.out.println("Shift: " + A.getDay() + "days");


        }
    }
