package ru.pgups.khalanskaya;

public class Tickets {
    private String number;

    private int date;

    private int time;

    public Tickets(){
        this.number = number;
        this.date = date;
        this.time = time;
    }
    public String getNumber(){return  this.number;}
    public void setNumber(String number){
        this.number = number;
    }
    public int getDate(){return this.date;}
    public void setDate(int date){
        this.date = date;
    }
    public int getTime(){return this.time;}
    public void setTime(int time){
        this.time = time;
    }
}
