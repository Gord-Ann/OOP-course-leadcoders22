public class Tour {

    private String country;
    private String city;
    private int safety;
    private int price;

    public Tour (String country, String city, int safety, int price){
        this.country = country;
        this.city = city;
        this.safety = safety;
        this.price = price;
    }

    public String getCountry () {
        return country;
    }
    public String getCity () {
        return city;
    }
    public int getSafety () {
        return safety;
    }
    public int getPrice() {
        return price;
    }
}
