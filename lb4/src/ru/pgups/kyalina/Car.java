package ru.pgups.kyalina;

public abstract class Car {
    protected String model;
    protected String number;
    protected String year;

    public  Car(String model, String number, String year){
        this.model = model;
        this.number = number;
        this.year = year;


    }
    public abstract void mileage();
    public void run() {
        System.out.println("");
    }



}

