public class Address {
    private String city;
    private String street;
    private int house_number;

    public Address(String city, String street, int house_number){
        this.city = city;
        this.street = street;
        this.house_number = house_number;
    }

    public Address(){
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse_number() {
        return house_number;
    }

    public void setHouse_number(int house_number) {
        if (house_number > 0) {
            this.house_number = house_number;
        }else{
            System.out.println("House number cannot be less than 0");
        }
    }
}
