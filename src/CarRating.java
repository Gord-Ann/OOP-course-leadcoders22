public class CarRating {
    private int manageabilityRating;
    private int dynamicsRating;
    private int comfortRating;
    private int reliabilityRating;
    private int transmissionRating;
    private int fuelconsumptionRating;
    private int designRating;
    private int trunkRating;
    private int safetyRating;

    public CarRating(int manageabilityRating, int dynamicsRating, int comfortRating, int reliabilityRating, int transmissionRating, int fuelconsumptionRating, int designRating, int trunkRating, int safetyRating){
        this.manageabilityRating = manageabilityRating;
        this.dynamicsRating = dynamicsRating;
        this.comfortRating = comfortRating;
        this.reliabilityRating = reliabilityRating;
        this.transmissionRating = transmissionRating;
        this.fuelconsumptionRating = fuelconsumptionRating;
        this.designRating = designRating;
        this.trunkRating = trunkRating;
        this.safetyRating = safetyRating;
    }

    public CarRating(){
    }

    public int getmanageabilityRating() {
        return manageabilityRating;
    }
    public void setmanageabilityRating(int manageabilityRating){
        if (manageabilityRating >= 0 && manageabilityRating <= 5){
            this.manageabilityRating = manageabilityRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getdynamicsRating() {
        return dynamicsRating;
    }
    public void setdynamicsRating(int dynamicsRating){
        if (dynamicsRating >= 0 && dynamicsRating <= 5){
            this.dynamicsRating = dynamicsRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getcomfortRating() {
        return comfortRating;
    }
    public void setcomfortRating(int comfortRating){
        if (comfortRating >= 0 && comfortRating <= 5){
            this.comfortRating = comfortRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getreliabilityRating() {
        return reliabilityRating;
    }
    public void setreliabilityRating(int reliabilityRating){
        if (reliabilityRating >= 0 && reliabilityRating <= 5){
            this.reliabilityRating = reliabilityRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int gettransmissionRating() {
        return transmissionRating;
    }
    public void settransmissionRating(int transmissionRating){
        if (transmissionRating >= 0 && transmissionRating <= 5){
            this.transmissionRating = transmissionRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getfuelconsumptionRating() {
        return fuelconsumptionRating;
    }
    public void setfuelconsumptionRating(int fuelconsumptionRating){
        if (fuelconsumptionRating >= 0 && fuelconsumptionRating <= 5){
            this.fuelconsumptionRating = fuelconsumptionRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getdesignRating() {
        return designRating;
    }
    public void setdesignRating(int designRating){
        if (designRating >= 0 && designRating <= 5){
            this.designRating = designRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

     public int gettrunkRating() {
        return trunkRating;
    }
    public void settrunkRating(int trunkRating){
        if (trunkRating >= 0 && trunkRating <= 5){
            this.trunkRating = trunkRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getsafetyRating(){
        return safetyRating;
    }
    public void setsafetyRating(int safetyRating){
        if (safetyRating >= 0 && safetyRating <= 5){
            this.safetyRating = safetyRating;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }




}
