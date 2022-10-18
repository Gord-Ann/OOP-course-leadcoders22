package ru.pgups.makarevich;

public class attendance {
    private String Name;

    private int number;

    private String time;

    public attendance(String Name, int number, String time){
        this.Name = Name;
        this.number = number;
        this.time = time;
    }

    public String getName(){ return this.Name; }

    public void setName(String Name) {
        this.Name = Name;
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
