package ru.pgups.kyalina;

public class Paymentmethod {

    private String cash;

    private int card;

    private int account;

    public Paymentmethod(String cash, int card, int account){
        this.cash = cash;
        this.card = card;
        this.account = account;
    }

    public Paymentmethod() {

    }

    public String getCash(){return  this.cash;}
    public void setCash(String cash){
        this.cash = cash;
    }
    public int getCard(){return this.card;}
    public void setCard(int card){
        this.card = card;
    }
    public int getAccount(){return this.account;}
    public void setAccount(int account){
        this.account = account;
    }

}
