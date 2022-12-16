package ru.pgups.kyalina;

public class BMWCar extends Car {
    private String country;
    public BMWCar(String model, String number, String year, String country) {
        super(model, number, year);
        this.country = country;
    }
    public void mileage() {
        System.out.println("the mileage of the car is 50,000 km");
    }
}





