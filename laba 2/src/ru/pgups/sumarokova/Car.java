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
            Car first_car = new Car("fork lift 1", 17.7, 2000);
            System.out.println("Car: " + first_car.getName());
            System.out.println("The car has a speed of " + first_car.getSpeedOfMovement()+ "km/h") ;
            System.out.println("The machine has a lifting height of " + first_car.getLiftingHeight()+ "cm");

            first_car.setName("fork lift 2");
            System.out.println("The car has another name: " + first_car.getName());

            first_car.setSpeedOfMovement(15.4);
            System.out.println("The car has a speed of " + first_car.getSpeedOfMovement() + "km/h");

            first_car.setLiftingHeight(2300);
            System.out.println("The machine has a lifting height of " + first_car.getLiftingHeight() + "cm");
        }

    }
