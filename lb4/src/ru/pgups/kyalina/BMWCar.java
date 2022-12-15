package ru.pgups.kyalina;

public class BMWCar extends Car  {
    private String country;
    public BMWCar(String model, String number, String year, String country) {
        super(model, number, year);
        this.country = country;
    }
     public void display() {
        super.display();
        System.out.println("Country: " + this.country);
     }
}



