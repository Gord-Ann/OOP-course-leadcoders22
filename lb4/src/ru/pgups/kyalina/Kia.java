package ru.pgups.kyalina;

public class Kia extends Car{


    private String engine;
    public Kia(String model, String number, String year, String engine) {
        super(model, number, year);
        this.engine = engine;

    }

    public void mileage() {
        System.out.println("");
    }

    }
