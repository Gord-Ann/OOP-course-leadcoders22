public class Engine {
    private String engineName;
    private String engineType;
    private int horsepowerNumber;

    public Engine(String engineName, String engineType, int horsepowerNumber){
        this.engineName = engineName;
        this.engineType = engineType;
        this.horsepowerNumber = horsepowerNumber;
    }

    public Engine(){
    }

    public String getengineName(){
        return engineName;
    }

    public void setengineName(String engineName){
        this.engineName = engineName;
    }

    public String getengineType() {
        return engineType;
    }

    public void setengineType(String engineType) {
        this.engineType = engineType;
    }

    public int gethorsepowerNumber(){
        return horsepowerNumber;
    }

    public void sethorsepowerNumber(int horsepowerNumber) {
        if (horsepowerNumber > 0) {
            this.horsepowerNumber = horsepowerNumber;
        } else {
            System.out.println("Year cannot be less than 0");
        }
    }
}