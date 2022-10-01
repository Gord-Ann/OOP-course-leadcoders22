public class Parametrs {
    private int trunkRatingVolume;
    private int fueltankVolume;
    private int carWeight;
    private int maxcarWeight;

    public Parametrs(int trunkRatingVolume, int fueltankVolume, int carWeight, int maxcarWeight){
        this.trunkRatingVolume = trunkRatingVolume;
        this.fueltankVolume = fueltankVolume;
        this.carWeight = carWeight;
        this.maxcarWeight = maxcarWeight;
    }

    public Parametrs(){
    }

    public int getfueltankVolume() {
        return fueltankVolume;
    }

    public void setfueltankVolume(int fueltankVolume) {
        if (fueltankVolume >= 0){
            this.fueltankVolume = fueltankVolume;
        }else{
            System.out.println("Fuel tank cannot be negative");
        }
    }

    public int getcarWeight() {
        return carWeight;
    }
    public void setcarWeight(int carWeight) {
        if (carWeight >= 0){
            this.carWeight = carWeight;
        }else{
            System.out.println("carWeight cannot be negative");
        }
    }

    public int gettrunkRatingVolume() {
        return trunkRatingVolume;
    }

    public void settrunkRatingVolume(int trunkRatingVolume) {
        if (trunkRatingVolume >= 0){
            this.trunkRatingVolume = trunkRatingVolume;
        }else{
            System.out.println("trunkRating volume cannot be negative");
        }
    }

    public int getmaxcarWeight() {
        return maxcarWeight;
    }
    public void setmaxcarWeight(int maxcarWeight) {
        if (maxcarWeight >= 0){
            this.maxcarWeight = carWeight;
        }else{
            System.out.println("Max carWeight cannot be negative");
        }
    }


}
