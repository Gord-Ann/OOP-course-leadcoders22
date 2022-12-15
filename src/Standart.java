import com.javarush.test.Room;

public class Standart extends Room {
    private String price;
    private String service;

    public Standart(String bed, String price, String service){
        super(bed, price);
        this.service =service;
    }
    public Standart() {
    }

    public void getInfo() {
        System.out.println("кровать: "+ this.getBed()+" цена "+this.price+" адрес "+this.service);
    }
}


