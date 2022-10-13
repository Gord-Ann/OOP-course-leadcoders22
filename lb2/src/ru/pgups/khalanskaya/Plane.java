package ru.pgups.khalanskaya;

public class Plane {
    private String number;

    private int model;

    private int weight;

    public Plane(){
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public String getNumber() {return  this.number;}
    public void setNumber (String number){
        this.number = number;
    }
    public int getModel(){return this.model;}
    public void setModel(int model){
        this.model = model;
    }
    public int getWeight(){return this.weight;}
    public void setWeight(int weight){
        this.weight = weight;
    }
}
