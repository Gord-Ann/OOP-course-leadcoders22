package ru.pgups.makarevich;

public class laundry {    private String name;

    private int year;

    private String city;

    public laundry(String name, int year, String city){
        this.name = name;
        this.year = year;
        this.city = city;
    }

    public String getName(){ return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() { return this.year; }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCity() { return this.city; }

    public void setCity(String city) {
        this.city = city;
    }
}
