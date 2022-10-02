package ru.pgups.nikolaev;


public class Field {

    private String coating;

    private int width;

    private int length;

    public Field(String coating, int width, int length ){
        this.coating = coating;
        this.width = width;
        this.length = length;

    }


    public String getCoating() {return this.coating;}
    public void setCoating(String coating){
        this.coating = coating;

    }

    public int getWidth() { return this.width;}
    public void setWidth(int width) {

        this.width = width;
    }

    public int  getLength() {return this.length;}
    public void setLength(int length) {

        this.length = length;
    }
}