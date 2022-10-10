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

    public String getEngineName(){
        return engineName;
    }

    public void setEngineName(String engineName){
        this.engineName = engineName;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getHorsepowerNumber(){
        return horsepowerNumber;
    }

    public void setHorsepowerNumber(int horsepowerNumber) {
        if (horsepowerNumber > 0) {
            this.horsepowerNumber = horsepowerNumber;
        } else {
            System.out.println("Year cannot be less than 0");
        }
    }
}