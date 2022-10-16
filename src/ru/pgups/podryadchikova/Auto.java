package ru.pgups.podryadchikova;

public class Auto {
    private String brand;
    private String color;
    private String transmission;
    private int release;
    private int price;
    private double run;
    private int owner;

    public Auto(String brand, String color, String transmission, int release, int price, double run, int owner) {
        this.brand = brand;
        this.color = color;
        this.transmission = transmission;
        this.release = release;
        this.price = price;
        this.run = run;
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getTrans() {
        return transmission;
    }
    public void setTrans(String transmission) {
        this.transmission = transmission;
    }
    public int getRelease() {
        return release;
    }
    public void setRelease(int release) {
        this.release = release;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public double getRun() {
        return run;
    }
    public void setRun(double run) {
        this.run = run;
    }
    public int getOwner() {
        return owner;
    }
    public void setOwner(int owner) {
        this.owner = owner;
    }



}
