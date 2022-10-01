public class Address {
    private String cityName;
    private String streetName;
    private int houseNumber;

    public Address(String cityName, String streetName, int houseNumber){
        this.cityName = cityName;
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    public Address(){
    }

    public String getcityName() {
        return cityName;
    }

    public void setcityName(String cityName) {
        this.cityName = cityName;
    }

    public String getstreetName() {
        return streetName;
    }

    public void setstreetName(String streetName) {
        this.streetName = streetName;
    }

    public int gethouseNumber() {
        return houseNumber;
    }

    public void sethouseNumber(int houseNumber) {
        if (houseNumber > 0) {
            this.houseNumber = houseNumber;
        }else{
            System.out.println("House number cannot be less than 0");
        }
    }
}
