package ru.pgups.sumarokova;

public class Conditions {

    private double temperature;
    private double humidity;
    private double lighting;

    public Conditions(double temperature, double humidity, double lighting) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.lighting = lighting;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getLighting() {
        return lighting;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public void setLighting(double lighting) {
        this.lighting = lighting;
    }
}
    class MainConditions{
public static void main(String[] args){

    Conditions A = new Conditions(13.2, 12.2,10);
    System.out.println("Temperature: " + A.getTemperature());
    System.out.println("Humidity: " + A.getHumidity());
    System.out.println("Lighting: " + A.getLighting());
}
}


