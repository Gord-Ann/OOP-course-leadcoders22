import java.util.Scanner;

public class AddressHospital {

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
    public void inputAddressHospital() {
        Scanner in = new Scanner(System.in);
        System.out.println("Город: ");
        String cityName = in.nextLine();
        System.out.println("Улица: ");
        String streetName = in.nextLine();
        System.out.println("Номер дома: ");
        int houseNum = in.nextInt();
        System.out.printf("Город: %s Улица: %s Номер дома: %d \n", cityName, streetName, houseNum);
    }
}
