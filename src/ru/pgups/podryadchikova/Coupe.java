package ru.pgups.podryadchikova;

public class Coupe {
    String brand;
    String color;
    int release;
    int price;
    double run;
    int owner;

    public Coupe (String brand, String color, int release, int price, double run, int owner) {
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
        Coupe auto = new Coupe("mazda", "purple", 2012, 200000, 745.67, 5);
        auto.showInfo();

        Coupe auto1 = new Coupe("honda", "blue", 2018, 400000, 423.8, 2);
        auto1.showInfo();
    }
}
