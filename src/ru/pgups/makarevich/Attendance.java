package ru.pgups.makarevich;

public class Attendance {
    private String name;

    private int number;

    private String time;

    public attendance(String name, int number, String time){
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public String getName(){ return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() { return this.number; }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() { return this.time; }

    public void setTime(String time ) {
        this.time = time;
    }
}
