public class Bonuses {
    private double amount;

    public Bonuses(double amount) {
        this.amount = amount;
    }

    public Bonuses() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else if (amount < 0) {
            System.out.println("Error. Insert the correct value");
        } else if (amount == 0) {
            System.out.println("You don't have any bonuses yet");
        }
    }
}