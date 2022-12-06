import java.lang.reflect.Type;

public class Building {
    private String type;
    private String place;

    public Building(String type, String place){
        this.type = type;
        this.place = place;
    }
    public String getType(){
        return type;
    }
    public String getPlace(){
        return place;
    }
}
