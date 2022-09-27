package ru.pgups.podryadchikova;

public class Pickup {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public Pickup(String brand, String color, int release, int price, double run, int owner) {
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
        Pickup auto = new Pickup("ford", "red", 2020, 2000000, 245.67, 1);
        auto.showInfo();

        Pickup auto1 = new Pickup("volvo", "black", 2021, 3000000, 123.8, 1);
        auto1.showInfo();
    }
}
