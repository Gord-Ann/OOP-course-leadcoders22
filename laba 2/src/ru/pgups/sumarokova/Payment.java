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
            Payment A = new Payment(1, true);
            System.out.println("Number: " + A.getNumber());
            System.out.println("Paid: " + A.getPaid());

            Payment B = new Payment(2, true);
            System.out.println("Number: " + B.getNumber());
            System.out.println("Paid: " + B.getPaid());

            Payment C = new Payment(3, false);
            System.out.println("Number: " + C.getNumber());
            System.out.println("Paid: " + C.getPaid());

            System.out.println(  "           Change in contract number 3:");

            System.out.println("Number: " + C.getNumber());

            C.setPaid(true);
            System.out.println("Paid: " + C.getPaid());
        }
    }


