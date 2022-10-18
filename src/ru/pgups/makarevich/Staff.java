package ru.pgups.makarevich;

public class staff {
    private String Name;

    private String rang;

    private int year;

    public staff(String Name, String rang, int year){
        this.Name = Name;
        this.rang = rang;
        this.year = year;
    }

    public String getName(){ return this.Name; }

    public void setName(String Name) {
        this.Name = Name;
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
