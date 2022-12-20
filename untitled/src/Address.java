import java.util.Scanner;

public class Address {

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNum() {
        return houseNum;
    }

    public void setHouseNum(int houseNum) {
        this.houseNum = houseNum;
    }

    private String cityName;
    private String streetName;
    private int houseNum;
    public void inputAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input City name: ");
        String cityName = in.nextLine();
        System.out.println("Input Street name: ");
        String streetName = in.nextLine();
        System.out.println("Input House number: ");
        int houseNum = in.nextInt();
        System.out.printf("City name: %s Street name: %s House Number: %d \n", cityName, streetName, houseNum);
    }
}


