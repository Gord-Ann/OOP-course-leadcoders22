package ru.pgups.sumarokova;

public class Main {

    public static void main(String[] args){

        Box small = new Box("Small",1200, 1200, 1200);
        System.out.println("Name Box " + small.getName()+ " cm");
        System.out.println( "Height: " + small.getHeight()+ " cm");
        System.out.println( "Width: " + small.getWidth()+ " cm");
        System.out.println( "Length: " + small.getLength()+ " cm");
        System.out.println(" ");

        Car firstCar = new Car("fork lift 1", 17.7, 2000);
        System.out.println("Car: " + firstCar.getName());
        System.out.println("The car has a speed of " + firstCar.getSpeedOfMovement()+ "km/h") ;
        System.out.println("The machine has a lifting height of " + firstCar.getLiftingHeight()+ "cm");
        System.out.println(" ");

        Client client1 = new Client("Kolay", 1, 4300);
        System.out.println("Name: " + client1.getName());
        System.out.println("Contract number: " + client1.getNumber());
        System.out.println("Price: " + client1.getPrice());
        System.out.println(" ");

        Conditions conditions1 = new Conditions(1, 13.2, 12.2,10);
        System.out.println("Number Contract: " + conditions1.getNumberContract());
        System.out.println("Temperature: " + conditions1.getTemperature());
        System.out.println("Humidity: " + conditions1.getHumidity());
        System.out.println("Lighting: " + conditions1.getLighting());
        System.out.println(" ");

        Payment payment1 = new Payment(1, true);
        System.out.println("contract number: " + payment1.getNumber());
        System.out.println("Paid: " + payment1.getPaid());
        System.out.println(" ");

        People person1 = new People("Ivan", 40, "technical department","manager");
        System.out.println("Name: " + person1.getName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Department: " + person1.getDepartment());
        System.out.println("Position: " + person1.getPosition());
        System.out.println(" ");

        Place place1 = new Place("Moscow", 50, 40,30);
        System.out.println("Building name: " + place1.getName());
        System.out.println("Building has " + place1.getOfSmall() + " Box small");
        System.out.println("Building has " + place1.getOfMedium() + " Box medium");
        System.out.println("Building has " + place1.getOfBig() + " Box big");
        System.out.println(" ");

        place1.setName("Moscow1");
        System.out.println("Building has another name: " + place1.getName());

        place1.setOfSmall(48);
        System.out.println(place1.getName() + " now has " + place1.getOfSmall() + " Box small");

        place1.setOfMedium(30);
        System.out.println(place1.getName() + " now has " + place1.getOfMedium() + " Box medium");

        place1.setOfBig(10);
        System.out.println(place1.getName() + " now has " + place1.getOfBig() + " Box big");
        System.out.println(" ");

        Salary number2 = new Salary(2, 4.5, 213);
        System.out.println("Salary number: " + number2.getNumber());
        System.out.println("Hour: " + number2.getHour()) ;
        System.out.println("Rate: " + number2.getRate());
        System.out.println("Result: " + number2.getHour()*number2.getRate());
        System.out.println(" ");

        WorkSchedul number1 = new WorkSchedul("Anna", "2/2");
        System.out.println("Name: " + number1.getName());
        System.out.println("Shift: " + number1.getDay() + " days");
    }


}
