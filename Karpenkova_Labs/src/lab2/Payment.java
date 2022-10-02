package lab2;

public class Payment {
    private String typeOfPayment;
    private int cost;


    public Payment(String typeOfPayment, int cost) {
        this.typeOfPayment = typeOfPayment;
        this.cost = cost;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}