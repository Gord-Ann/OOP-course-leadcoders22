public class Parametrs {
    private int trunkRatingVolume;
    private int fuelTankVolume;
    private int carWeight;
    private int maxCarWeight;

    public Parametrs(int trunkRatingVolume, int fuelTankVolume, int carWeight, int maxCarWeight){
        this.trunkRatingVolume = trunkRatingVolume;
        this.fuelTankVolume = fuelTankVolume;
        this.carWeight = carWeight;
        this.maxCarWeight = maxCarWeight;
    }

    public Parametrs(){
    }

    public int getFuelTankVolume() {
        return fuelTankVolume;
    }

    public void setFuelTankVolume(int fuelTankVolume) {
        if (fuelTankVolume >= 0){
            this.fuelTankVolume = fuelTankVolume;
        }else{
            System.out.println("Fuel tank cannot be negative");
        }
    }

    public int getCarWeight() {
        return carWeight;
    }
    public void setCarWeight(int carWeight) {
        if (carWeight >= 0){
            this.carWeight = carWeight;
        }else{
            System.out.println("carWeight cannot be negative");
        }
    }

    public int getTrunkRatingVolume() {
        return trunkRatingVolume;
    }

    public void setTrunkRatingVolume(int trunkRatingVolume) {
        if (trunkRatingVolume >= 0){
            this.trunkRatingVolume = trunkRatingVolume;
        }else{
            System.out.println("trunkRating volume cannot be negative");
        }
    }

    public int getMaxCarWeight() {
        return maxCarWeight;
    }
    public void setMaxCarWeight(int maxCarWeight) {
        if (maxCarWeight >= 0){
            this.maxCarWeight = carWeight;
        }else{
            System.out.println("Max carWeight cannot be negative");
        }
    }


}
