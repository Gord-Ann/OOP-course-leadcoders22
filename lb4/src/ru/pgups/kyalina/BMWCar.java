package ru.pgups.kyalina;

public class BMWCar extends Car {

    private String color;
    private String model;

    public BMWCar(String Model, int number, String color, String model) {
        super(model, number);
        this.color = color;
        this.model = model;
    }

    public BMWCar() {
        super();

    }

    @Override
    void run() {
        run();
        System.out.println("Color:" + this.color);
        System.out.println("Model:" + this.model);
    }
}



