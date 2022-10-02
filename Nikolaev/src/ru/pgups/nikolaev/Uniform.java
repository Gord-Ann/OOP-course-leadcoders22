package ru.pgups.nikolaev;

public class Uniform {
    private String color;

    private int size;

    private String season;

    public Uniform (String color, int size, String season){
        this.color = color;
        this.size = size;
        this.season = season;

    }


    public String getColor(){ return this.color;}
    public void setColor    (String color){
        this.color = color;

    }

    public int getSize() { return this.size;}
    public void setSize(int size) {

        this.size = size;
    }

    public String getSeason() { return this.season;}
    public void setSeason(String season) {
        this.season= season;}
}
