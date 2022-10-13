package ru.pgups.sumarokova;

public class Car {


    private String name;
    private double speedOfMovement;
    private int liftingHeight;

    public Car(String name, double speedOfMovement, int liftingHeight) {
        this.name = name;
        this.speedOfMovement = speedOfMovement;
        this.liftingHeight = liftingHeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeedOfMovement() {
        return speedOfMovement;
    }

    public void setSpeedOfMovement(double speedOfMovement) {
        this.speedOfMovement = speedOfMovement;
    }

    public int getLiftingHeight() {
        return liftingHeight;
    }

    public void setLiftingHeight(int liftingHeight) {
        this.liftingHeight = liftingHeight;
    }
}
