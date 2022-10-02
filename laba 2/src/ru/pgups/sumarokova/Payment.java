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
            Payment client1 = new Payment(1, true);
            System.out.println("Number: " + client1.getNumber());
            System.out.println("Paid: " + client1.getPaid());

            Payment client2 = new Payment(2, true);
            System.out.println("Number: " + client2.getNumber());
            System.out.println("Paid: " + client2.getPaid());

            Payment client3 = new Payment(3, false);
            System.out.println("Number: " + client3.getNumber());
            System.out.println("Paid: " + client3.getPaid());

            System.out.println("Change in contract number 3:");

            System.out.println("Number: " + client3.getNumber());

            client3.setPaid(true);
            System.out.println("Paid: " + client3.getPaid());
        }
    }


