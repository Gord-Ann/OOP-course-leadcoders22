package ru.pgups.podryadchikova;

public class Automatic {
    private String brand;
    private String body;
    private int release;
    private double run;

    public Automatic(String brand, String body, int release, double run) {
        this.brand = brand;
        this.body = body;
        this.release = release;
        this.run = run;
    }

    public double getRun() {
        return run;
    }
    public void setRun(double run) {
        this.run = run;
    }

    public int getRelease() {
        return release;
    }
    public void setRelease(int release) {
        this.release = release;
    }

    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
