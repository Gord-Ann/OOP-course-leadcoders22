package ru.pgups.kyalina;

public class Payment {

    private String amount ;
    private int date;
    private int paymentId ;

    public Payment(String amount, int date, int paymentId ) {
        this.amount = amount;
        this.date = date;
        this.paymentId = paymentId;
    }
    public String getcarAmount() {return this.amount;}
    public void setAmount (String amount) {
        this.amount = amount;
    }
    public int getDate() {return this.date;}
    public void setDate(int date) {
        this.date = date;
    }
    public int getpaymentId(){return this.paymentId;}
    public void setpaymentId(int paymentId) {
        this.paymentId = paymentId;
    }
}

