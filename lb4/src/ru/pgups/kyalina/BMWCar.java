package ru.pgups.kyalina;

public class BMWCar extends Car{

    private String color;
    private String model;

    public BMWCar(String color, String model) {
        this.color = color;
        this.model = model;
    }
    @Override
    void run() {
        run();
        System.out.println("Color:" + this.color);
        System.out.println("Model:" + this.model);
    }
}



