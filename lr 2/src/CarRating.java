public class CarRating {
    private int manageabilityRating;
    private int dynamicsRating;
    private int comfortRating;
    private int reliabilityRating;
    private int transmissionRating;
    private int fuelConsumptionRating;
    private int designRating;
    private int trunkRating;
    private int safetyRating;

    public CarRating(int manageabilityRating, int dynamicsRating, int comfortRating, int reliabilityRating, int transmissionRating, int fuelConsumptionRating, int designRating, int trunkRating, int safetyRating){
        this.manageabilityRating = manageabilityRating;
        this.dynamicsRating = dynamicsRating;
        this.comfortRating = comfortRating;
        this.reliabilityRating = reliabilityRating;
        this.transmissionRating = transmissionRating;
        this.fuelConsumptionRating = fuelConsumptionRating;
        this.designRating = designRating;
        this.trunkRating = trunkRating;
        this.safetyRating = safetyRating;
    }

    public CarRating(){
    }

    public int getManageabilityRating() {
        return manageabilityRating;
    }
    public void setManageabilityRating(int manageabilityRating){
        if (manageabilityRating >= 0 && manageabilityRating <= 5){
            this.manageabilityRating = manageabilityRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getDynamicsRating() {
        return dynamicsRating;
    }
    public void setDynamicsRating(int dynamicsRating){
        if (dynamicsRating >= 0 && dynamicsRating <= 5){
            this.dynamicsRating = dynamicsRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getComfortRating() {
        return comfortRating;
    }
    public void setComfortRating(int comfortRating){
        if (comfortRating >= 0 && comfortRating <= 5){
            this.comfortRating = comfortRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getReliabilityRating() {
        return reliabilityRating;
    }
    public void setReliabilityRating(int reliabilityRating){
        if (reliabilityRating >= 0 && reliabilityRating <= 5){
            this.reliabilityRating = reliabilityRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getTransmissionRating() {
        return transmissionRating;
    }
    public void setTransmissionRating(int transmissionRating){
        if (transmissionRating >= 0 && transmissionRating <= 5){
            this.transmissionRating = transmissionRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getFuelConsumptionRating() {
        return fuelConsumptionRating;
    }
    public void setFuelConsumptionRating(int fuelConsumptionRating){
        if (fuelConsumptionRating >= 0 && fuelConsumptionRating <= 5){
            this.fuelConsumptionRating = fuelConsumptionRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getDesignRating() {
        return designRating;
    }
    public void setDesignRating(int designRating){
        if (designRating >= 0 && designRating <= 5){
            this.designRating = designRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

     public int getTrunkRating() {
        return trunkRating;
    }
    public void setTrunkRating(int trunkRating){
        if (trunkRating >= 0 && trunkRating <= 5){
            this.trunkRating = trunkRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getSafetyRating(){
        return safetyRating;
    }
    public void setSafetyRating(int safetyRating){
        if (safetyRating >= 0 && safetyRating <= 5){
            this.safetyRating = safetyRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }




}
