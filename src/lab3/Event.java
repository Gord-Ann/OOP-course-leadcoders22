package lab3;

import java.util.List;

public abstract class Event {
    private String name;
    private String date;
    private String place;
    private int seats;

    private List<Member> members;


    public Event(String name, String date, String place, int seats ){
        this.name = name;
        this.date = date;
        this.place = place;
        this.seats = seats;

    }

    public void display() {
        System.out.println (this.name + " " + this.date + " " + this.place + " " + this.seats);
    }
}
