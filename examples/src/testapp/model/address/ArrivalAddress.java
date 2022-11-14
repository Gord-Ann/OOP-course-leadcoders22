package testapp.model.address;

public class ArrivalAddress extends Address {

    private String time;

    public ArrivalAddress(String city, String country, String streetName, String streetNumber, String time) {
        super(city, country, streetName, streetNumber);
        this.time = time;
    }
}
