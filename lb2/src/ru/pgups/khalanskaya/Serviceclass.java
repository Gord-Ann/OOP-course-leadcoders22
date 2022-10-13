package ru.pgups.khalanskaya;

public class Serviceclass {
    private String economy;

    private int comfort;

    private int business;

    public Serviceclass(){
        this.economy = economy;
        this.comfort = comfort;
        this.business = business;
    }
    public String getEconomy() {return this.economy;}
    public void setEconomy (String economy){
        this.economy = economy;
    }
    public int getComfort(){return this.comfort;}
    public void setComfort(int comfort){
        this.comfort = comfort;
    }
    public int getBusiness(){return this.business;}
    public void setBusiness(int business){
        this.business = business;
    }
}
