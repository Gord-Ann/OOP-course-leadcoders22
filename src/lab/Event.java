package lab;

import java.util.List;

public abstract class Event {
    protected String name;
    protected String date;
    protected String place;
    protected int seats;
    protected List<Member> members;
    protected List<Expert> experts;

    public Event(String name, String date, String place, int seats, List<Member> members, List<Expert> experts) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.seats = seats;
        this.members = members;
        this.experts = experts;
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

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    public List<Expert> getExperts() {
        return experts;
    }

    public void setExperts(List<Expert> experts) {
        this.experts = experts;
    }

    public abstract void display();
}
