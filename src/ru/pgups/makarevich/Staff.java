package ru.pgups.makarevich;

public class Staff {
    private String name;

    private String rang;

    private int year;

    public staff(String name, String rang, int year){
        this.name = name;
        this.rang = rang;
        this.year = year;
    }

    public String getname(){ return this.name; }

    public void setname(String name) {
        this.name = name;
    }

    public String getrang() { return this.rang; }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public int getYear() { return this.year; }

    public void setYear(int year) {
        this.year = year;
    }
}
