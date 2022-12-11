package lab3;

import java.util.List;

public abstract class Event {
    protected String name;
    protected String date;
    protected String place;
    protected int seats;



    public Event(String name, String date, String place, int seats) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.seats = seats;

    }

    public Event() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }



    public void display() {
    }
}
