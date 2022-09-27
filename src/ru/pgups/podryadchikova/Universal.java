package ru.pgups.podryadchikova;

public class Universal {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public Universal(String brand, String color, int release, int price, double run, int owner) {
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
        Universal auto = new Universal("mercedes", "white", 2015, 1000000, 345.67, 3);
        auto.showInfo();

        Universal auto1 = new Universal("kia", "red", 2018, 300000, 223.8, 1);
        auto1.showInfo();
    }
}
