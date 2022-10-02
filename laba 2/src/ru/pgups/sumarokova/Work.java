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
            Work anna = new Work("Anna", "2/2");
            System.out.println("Name: " + anna.getName());
            System.out.println("Shift: " + anna.getDay() + "days");

            Work vika = new Work("Vika", "3/1");
            System.out.println("Name: " + vika.getName());
            System.out.println("Shift: " + vika.getDay() + "days");

            System.out.println("The data has been changed");

            anna.setName("Annya");
            System.out.println("Name: " + anna.getName());

            anna.setDay("3/2");
            System.out.println("Shift: " + anna.getDay() + "days");


        }
    }
