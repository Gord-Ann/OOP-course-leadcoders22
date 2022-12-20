import java.util.Scanner;

public class Car {

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public int getOdometerAmount() {
        return odometerAmount;
    }

    public void setOdometerAmount(int odometerAmount) {
        this.odometerAmount = odometerAmount;
    }

    private String carName;
    private String carModel;
    private int carYear;
    private int odometerAmount;
    public void inputCar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input Car Name: ");
        carName = in.nextLine();
        System.out.println("Input Car Model: ");
        carModel = in.nextLine();
        System.out.println("Input Car Year: ");
        carYear = in.nextInt();
        System.out.println("Input Odometer amount: ");
        odometerAmount = in.nextInt();
        System.out.printf("Car name: %s,Car model: %s,Car Year: %d,Odometer amount: %d \n", carName, carModel, carYear, odometerAmount);
    }
}