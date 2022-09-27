package ru.pgups.podryadchikova;

public class Auto {
    String brand;
    String color;
    String transmission;
    int release;
    int price;
    double run;
    int owner;

    public Auto(String brand, String color, String transmission, int release, int price, double run, int owner) {
        this.brand = brand;
        this.color = color;
        this.transmission = transmission;
        this.release = release;
        this.price = price;
        this.run = run;
        this.owner = owner;
    }

    void showInfo() {
        System.out.println("Brand:" + brand);
        System.out.println("Color:" + color);
        System.out.println("transmission:" + transmission);
        System.out.println("Release:" + release);
        System.out.println("Price:" + price);
        System.out.println("Run:" + run);
        System.out.println("Owner:" + owner);
    }


    public static void main(String[] args) {
        Auto auto = new Auto("bmw", "black","automatic", 2017, 600000, 345.67,1);
        auto.showInfo();

        Auto auto1 = new Auto("audi", "pink", "automatic",2019, 500000, 456.8, 2);
        auto1.showInfo();
    }
}
