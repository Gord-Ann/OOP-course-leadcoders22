public class VinCheck {

    private int roadAccidentsAmount;
    private int ownersAmount;

    public VinCheck(int roadAccidentsAmount, int ownersAmount){
        this.roadAccidentsAmount = roadAccidentsAmount;
        this.ownersAmount = ownersAmount;
    }

    public VinCheck(){
    }

    public int getRoadAccidentsAmount() {
        return roadAccidentsAmount;
    }

    public void setRoadAccidentsAmount(int roadAccidentsAmount) {
        if (roadAccidentsAmount >= 0) {
            this.roadAccidentsAmount = roadAccidentsAmount;
        }else{
            System.out.println("Road accidents amount cannot be negative");
        }
    }

    public int getOwnersAmount() {
        return ownersAmount;
    }

    public void setOwnersAmount(int ownersAmount) {
        if (ownersAmount >= 0) {
            this.ownersAmount = ownersAmount;
        }else{
            System.out.println("Owners amount cannot be negative");
        }
    }
}
