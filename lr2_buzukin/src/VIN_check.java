public class VIN_check {

    private int road_accidents_amount;
    private int owners_amount;

    public VIN_check(int road_accidents_amount, int owners_amount){
        this.road_accidents_amount = road_accidents_amount;
        this.owners_amount = owners_amount;
    }

    public VIN_check(){
    }

    public int getRoad_accidents_amount() {
        return road_accidents_amount;
    }

    public void setRoad_accidents_amount(int road_accidents_amount) {
        if (road_accidents_amount >= 0) {
            this.road_accidents_amount = road_accidents_amount;
        }else{
            System.out.println("Road accidents amount cannot be negative");
        }
    }

    public int getOwners_amount() {
        return owners_amount;
    }

    public void setOwners_amount(int owners_amount) {
        if (owners_amount >= 0) {
            this.owners_amount = owners_amount;
        }else{
            System.out.println("Owners amount cannot be negative");
        }
    }
}
