public class Engine {
    private String engine_name;
    private String engine_type;
    private int horsepower;

    public Engine(String engine_name, String engine_type, int horsepower){
        this.engine_name = engine_name;
        this.engine_type = engine_type;
        this.horsepower = horsepower;
    }

    public Engine(){
    }

    public String getEngine_name(){
        return engine_name;
    }

    public void setEngine_name(String engine_name){
        this.engine_name = engine_name;
    }

    public String getEngine_type() {
        return engine_type;
    }

    public void setEngine_type(String engine_type) {
        this.engine_type = engine_type;
    }

    public int getHorsepower(){
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        } else {
            System.out.println("Year cannot be less than 0");
        }
    }
}