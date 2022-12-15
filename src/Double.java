import com.javarush.test.Room;

import static java.lang.System.*;

public class Double extends Room {
    private String king_size_bed;
    private String service;
    private String price;

    public Double (String king_size_bed, String price, String service){
        super(price, price);
        this.king_size_bed = king_size_bed;
        this.service =service;
    }
    public Double() {
    }
    public void getInfo() {
        System.out.println("king size" + this.king_size_bed + "price" + this.price + " service " + this.service);
    }
}
