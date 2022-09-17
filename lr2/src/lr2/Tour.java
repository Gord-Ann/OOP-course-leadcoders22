package lr2;

public class Tour {
    String country;
    String city;
    int price;

    public Tour(){
    }
    void ShowInfo() {
        System.out.println("country: " + country);
        System.out.println("city: " + city);
        System.out.println("price: " + price);
    }
}