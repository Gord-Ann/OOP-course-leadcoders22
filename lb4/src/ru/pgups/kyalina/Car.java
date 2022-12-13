package ru.pgups.kyalina;

public abstract class Car {
    protected String model;
    protected int number;
    public Car(String model, int number){
        this.model = model;
        this.number = number;


    }

    public Car() {
        System.out.println("Model" + this.model);
        System.out.println("Number" + this.number);

    }

    abstract void run() ; {}  }
