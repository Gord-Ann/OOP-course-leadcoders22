package ru.pgups.sumarokova;

public class Conditions {

    private int numberContract;
    private double temperature;
    private double humidity;
    private double lighting;

    public Conditions(int numberContract, double temperature, double humidity, double lighting) {
        this.numberContract = numberContract;
        this.temperature = temperature;
        this.humidity = humidity;
        this.lighting = lighting;

    }

    public int getNumberContract() {
        return numberContract;
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

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
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


