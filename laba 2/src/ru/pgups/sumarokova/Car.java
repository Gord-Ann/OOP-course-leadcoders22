package ru.pgups.sumarokova;

public class Car {


    private String name;
    private double speed_of_movement;
    private int lifting_height;

    public Car(String name, double speed_of_movement, int lifting_height) {
        this.name = name;
        this.speed_of_movement = speed_of_movement;
        this.lifting_height = lifting_height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed_of_movement() {
        return speed_of_movement;
    }

    public void setSpeed_of_movement(double speed_of_movement) {
        this.speed_of_movement = speed_of_movement;
    }

    public int getLifting_height() {
        return lifting_height;
    }

    public void setLifting_height(int lifting_height) {
        this.lifting_height = lifting_height;
    }
}
    class MainCar {

        public static void main(String[] args){
            Car first_car = new Car("fork lift 1", 17.7, 2000);
            System.out.println("Car: " + first_car.getName());
            System.out.println("The car has a speed of " + first_car.getSpeed_of_movement() + "km/h") ;
            System.out.println("The machine has a lifting height of " + first_car.getLifting_height()+ "cm");

            first_car.setName("fork lift 2");
            System.out.println("The car has another name: " + first_car.getName());

            first_car.setSpeed_of_movement(15.4);
            System.out.println("The car has a speed of " + first_car.getSpeed_of_movement() + "km/h");

            first_car.setLifting_height(2300);
            System.out.println("The machine has a lifting height of " + first_car.getLifting_height() + "cm");
        }

    }
