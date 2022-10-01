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
    class MainCar {

        public static void main(String[] args){
            Car firstCar = new Car("fork lift 1", 17.7, 2000);
            System.out.println("Car: " + firstCar.getName());
            System.out.println("The car has a speed of " + firstCar.getSpeedOfMovement()+ "km/h") ;
            System.out.println("The machine has a lifting height of " + firstCar.getLiftingHeight()+ "cm");

            firstCar.setName("fork lift 2");
            System.out.println("The car has another name: " + firstCar.getName());

            firstCar.setSpeedOfMovement(15.4);
            System.out.println("The car has a speed of " + firstCar.getSpeedOfMovement() + "km/h");

            firstCar.setLiftingHeight(2300);
            System.out.println("The machine has a lifting height of " + firstCar.getLiftingHeight() + "cm");
        }

    }
