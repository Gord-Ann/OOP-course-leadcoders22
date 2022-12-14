public class Car {

    private String carName;
    private String carModel;
    private int carYear;
    private int odometerAmount;

    public Car (String carName, String carModel, int carYear, int odometerAmount){
        this.carName = carName;
        this.carModel = carModel;
        this.carYear = carYear;
        this.odometerAmount = odometerAmount;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public int getOdometerAmount() {
        return odometerAmount;
    }
}
