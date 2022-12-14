public class CarCharestics {

    private int horsePower;
    private int engineCapacity;
    private String bodyType;
    private String transmissionType;

    public CarCharestics(int horsePower, int engineCapacity, String bodyType, String transmissionType){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
        this.bodyType = bodyType;
        this.transmissionType = transmissionType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }
}
