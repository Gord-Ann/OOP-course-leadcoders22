public class Insurance {
    private double amount;

    public Insurance(double amount) {
        this.amount = amount;
    }

    public Insurance() {
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
            System.out.println("You don't have any insurance yet");
        }
    }
}