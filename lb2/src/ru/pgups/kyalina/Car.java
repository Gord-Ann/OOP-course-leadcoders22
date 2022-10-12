package ru.pgups.kyalina;

public class Car {

    private String number;

    private int model;

    private int carbrand;

    public void Car(String number, int model, int carbrand){
        this.number = number;
        this.model = model;
        this.carbrand = carbrand;
    }
    public String getNumber() {return this.number;}
    public void setNumber (String number){
        this.number = number;
    }
    public int getModel(){return this.model;}
    public void setModel(int model){
        this.model = model;
    }
    public int getcarBrand(){return this.carbrand;}
    public void setcarBrand(int carbrand){
        this.carbrand = carbrand;
    }


}
