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
            Work Anna = new Work("Anna", "2/2");
            System.out.println("Name: " + Anna.getName());
            System.out.println("Shift: " + Anna.getDay() + "days");

            Work Vika = new Work("Vika", "3/1");
            System.out.println("Name: " + Vika.getName());
            System.out.println("Shift: " + Vika.getDay() + "days");

            System.out.println("The data has been changed");

            Anna.setName("Annya");
            System.out.println("Name: " + Anna.getName());

            Anna.setDay("3/2");
            System.out.println("Shift: " + Anna.getDay() + "days");


        }
    }
