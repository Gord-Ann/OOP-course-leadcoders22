package ru.pgups.nikolaev;

public class Team {

    private String name;

    private int amount;

    private String capitan;

    public Team(String name, int amount, String capitan ){
        this.name = name    ;
        this.amount = amount;
        this.capitan = capitan;

    }


    public String getName() {return this.name;}
    public void setName(String name){
        this.name = name;

    }

    public int getAmount() { return this.amount;}
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String  getCapitan() {return this.capitan;}
    public void setCapitan(String capitan) {
        this.capitan = capitan;
    }
}
