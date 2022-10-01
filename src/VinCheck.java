public class VinCheck {

    private int roadaccidentsAmount;
    private int ownersAmount;

    public VinCheck(int roadaccidentsAmount, int ownersAmount){
        this.roadaccidentsAmount = roadaccidentsAmount;
        this.ownersAmount = ownersAmount;
    }

    public VinCheck(){
    }

    public int getroadaccidentsAmount() {
        return roadaccidentsAmount;
    }

    public void setroadaccidentsAmount(int roadaccidentsAmount) {
        if (roadaccidentsAmount >= 0) {
            this.roadaccidentsAmount = roadaccidentsAmount;
        }else{
            System.out.println("Road accidents amount cannot be negative");
        }
    }

    public int getownersAmount() {
        return ownersAmount;
    }

    public void setownersAmount(int ownersAmount) {
        if (ownersAmount >= 0) {
            this.ownersAmount = ownersAmount;
        }else{
            System.out.println("Owners amount cannot be negative");
        }
    }
}
