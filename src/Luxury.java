import com.javarush.test.Room;

public class Luxury extends Room {
    private String breakfast;
    private String service;
    private String price;

    public Luxury(String bed, String breakfast, String service, String price) {
super (bed);
        this.breakfast = breakfast;
        this.service = service;
        this.price = price;


    }

    public void getInfo() {
        System.out.println("кровать: "+ this.getBed()+" цена "+this.price+" адрес "+this.service);
    }
}
