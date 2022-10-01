package ru.pgups.sumarokova;

public class Payment {
    private int number;
    private boolean paid;

    public Payment(int number, boolean paid) {
        this.number = number;
        this.paid = paid;
    }

    public int getNumber() {
        return number;
    }

    public boolean getPaid() {
        return paid;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }
}
    class MainMain {
        public static void main(String[] args) {
            Payment Client1 = new Payment(1, true);
            System.out.println("Number: " + Client1.getNumber());
            System.out.println("Paid: " + Client1.getPaid());

            Payment Client2 = new Payment(2, true);
            System.out.println("Number: " + Client2.getNumber());
            System.out.println("Paid: " + Client2.getPaid());

            Payment Client3 = new Payment(3, false);
            System.out.println("Number: " + Client3.getNumber());
            System.out.println("Paid: " + Client3.getPaid());

            System.out.println("Change in contract number 3:");

            System.out.println("Number: " + Client3.getNumber());

            Client3.setPaid(true);
            System.out.println("Paid: " + Client3.getPaid());
        }
    }


