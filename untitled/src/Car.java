import java.util.Scanner;

public class Car {
    public void inputCar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Car Name: ");
        String carName = in.nextLine();
        System.out.println("Input Car Model: ");
        String carModel = in.nextLine();
        System.out.println("Input Car Year: ");
        int carYear = in.nextInt();
        System.out.println("Input Odometer amount: ");
        int odometerAmount = in.nextInt();
        System.out.printf("Car name: %s,Car model: %s,Car Year: %d,Odometer amount: %d \n", carName, carModel, carYear, odometerAmount);
    }
}