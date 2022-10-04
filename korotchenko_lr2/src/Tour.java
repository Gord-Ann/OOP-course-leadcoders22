public class Tour {
    private String country;
    private String city;
    private int price;

    public Tour (String country, String city, int price){
        this.country = country;
        this.city = city;
        this.price = price;
    }

    public Tour(){
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}