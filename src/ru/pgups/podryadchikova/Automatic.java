package ru.pgups.podryadchikova;

public class Automatic {
    String brand;
    String body;
    int release;
    double run;

    public Automatic (String brand, String body, int release, double run) {
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
        Automatic auto = new Automatic("skoda", "sedan", 2018, 645.24);
        auto.showInfo();

        Automatic auto1 = new Automatic("mazda", "cabriolet", 2021,235.6);
        auto1.showInfo();
    }
}
