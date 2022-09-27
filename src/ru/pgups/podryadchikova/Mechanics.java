package ru.pgups.podryadchikova;

public class Mechanics {
    String brand;
    String body;
    int release;
    double run;

    public Mechanics(String brand, String body, int release, double run) {
        this.brand = brand;
        this.body = body;
        this.release = release;
        this.run = run;
    }
    void showInfo() {
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + body);
        System.out.println("Release:" + release);
        System.out.println("Run:" + run);
    }
    public static void main(String[] args) {
        Mechanics auto = new Mechanics("ford", "universal", 2015, 345.24);
        auto.showInfo();

        Mechanics auto1 = new Mechanics("kia", "coupe", 2018, 345.6);
        auto1.showInfo();
    }
}
