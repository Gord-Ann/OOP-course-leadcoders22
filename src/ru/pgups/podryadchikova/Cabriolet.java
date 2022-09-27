package ru.pgups.podryadchikova;

public class Cabriolet {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public Cabriolet (String brand, String color, int release, int price, double run, int owner) {
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
        Cabriolet auto = new Cabriolet("porshe", "red", 2022, 10000000, 100.67, 1);
        auto.showInfo();

        Cabriolet auto1 = new Cabriolet("ford", "blue", 2019, 1000000, 323.8, 2);
        auto1.showInfo();

        Cabriolet auto2 = new Cabriolet("mercedes", "white", 2020, 2000000, 233.8, 1);
        auto2.showInfo();
    }
}
