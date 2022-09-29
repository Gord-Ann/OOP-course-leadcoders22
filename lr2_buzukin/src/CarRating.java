public class CarRating {
    private int manageability;
    private int dynamics;
    private int comfort;
    private int reliability;
    private int transmission;
    private int fuel_consumption;
    private int design;
    private int trunk;
    private int safety;

    public CarRating(int manageability, int dynamics, int comfort, int reliability, int transmission, int fuel_consumption, int design, int trunk, int safety){
        this.manageability = manageability;
        this.dynamics = dynamics;
        this.comfort = comfort;
        this.reliability = reliability;
        this.transmission = transmission;
        this.fuel_consumption = fuel_consumption;
        this.design = design;
        this.trunk = trunk;
        this.safety = safety;
    }

    public CarRating(){
    }

    public int getManageability() {
        return manageability;
    }
    public void setManageability(int manageability){
        if (manageability >= 0 && manageability <= 5){
            this.manageability = manageability;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }
    public int getDynamics() {
        return dynamics;
    }
    public void setDynamics(int dynamics){
        if (dynamics >= 0 && dynamics <= 5){
            this.dynamics = dynamics;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getComfort() {
        return dynamics;
    }
    public void setComfort(int comfort){
        if (comfort >= 0 && comfort <= 5){
            this.comfort = comfort;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getReliability() {
        return reliability;
    }
    public void setReliability(int reliability){
        if (reliability >= 0 && reliability <= 5){
            this.reliability = reliability;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getTransmission() {
        return transmission;
    }
    public void setTransmission(int transmission){
        if (transmission >= 0 && transmission <= 5){
            this.transmission = transmission;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getFuel_consumption() {
        return fuel_consumption;
    }
    public void setFuel_consumption(int fuel_consumption){
        if (fuel_consumption >= 0 && fuel_consumption <= 5){
            this.fuel_consumption = fuel_consumption;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getDesign() {
        return design;
    }
    public void setDesign(int design){
        if (design >= 0 && design <= 5){
            this.design = design;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

     public int getTrunk() {
        return trunk;
    }
    public void setTrunk(int trunk){
        if (trunk >= 0 && trunk <= 5){
            this.trunk = trunk;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }

    public int getSafety(){
        return safety;
    }
    public void setSafety(int safety){
        if (safety >= 0 && safety <= 5){
            this.safety = safety;
        }else{
            System.out.println("Rating cannot be less than 0 or more than 5");
        }

    }




}
