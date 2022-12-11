public class Place {

    private String district;
    private String city;
    private int safety;
    private int price;

    public Place (String district, String city, int safety, int price){
        this.district = district;
        this.city = city;
        this.safety = safety;
        this.price = price;
    }

    public String getDistrict () {
        return district;
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
