package ru.pgups.kyalina;

public abstract class Car {
    protected String model;
    protected String number;
    protected String year;

    public Car(String model, String number, String year){
        this.model = model;
        this.number = number;
        this.year = year;
    }
    public void display() {
        System.out.println(this.model +" " + this.number);
        System.out.println("Year:" + this.year);
    }

}

