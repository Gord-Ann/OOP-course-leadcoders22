package ru.pgups.khalanskaya;

public class Flights {
    private String charter;

    private int direct;

    private int transit;

    public Flights(){
        this.charter = charter;
        this.direct = direct;
        this.transit = transit;
    }
    public String getCharter(){return this.charter;}
    public void setCharter (String charter){
        this.charter = charter;
    }
    public int getDirect(){return this.direct;}
    public void  setDirect(int direct){
        this.direct = direct;
    }
    public int getTransit(){return this.transit;}
    public void setTransit(int transit){
        this.transit = transit;
    }
}
