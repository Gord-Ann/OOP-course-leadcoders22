package ru.pgups.podryadchikova;

public class Sedan {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public Sedan (String brand, String color, int release, int price, double run, int owner) {
        this.brand = brand;
        this.color = color;
        this.release = release;
        this.price = price;
        this.run = run;
        this.owner = owner;
    }
    void showInfo() {
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + color);
        System.out.println("Release:" + release);
        System.out.println("Price:" + price);
        System.out.println("Run:" + run);
        System.out.println("Owner:" + owner);
    }

    public static void main(String[] args) {
        Sedan auto = new Sedan("ford", "green", 2020, 400000, 545.67, 1);
        auto.showInfo();

        Sedan auto1 = new Sedan("honda", "grey", 2017, 200000, 423.8, 2);
        auto1.showInfo();
    }
}
