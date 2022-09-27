package ru.pgups.podryadchikova;

public class SUV {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public SUV(String brand, String color, int release, int price, double run, int owner) {
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
        SUV auto = new SUV("kia", "white", 2014, 200000, 645.67, 4);
        auto.showInfo();

        SUV auto1 = new SUV("volvo", "black", 2021, 3000000, 123.8, 1);
        auto1.showInfo();
    }
}
