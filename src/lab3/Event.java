package lab3;

import java.util.List;

public abstract class Event {
    private String name;
    private String date;
    private String place;
    private int seats;

    //private List<Member> members;


    public Event(String name, String date, String place, int seats) {
        this.name = name;
        this.date = date;
        this.place = place;
        this.seats = seats;
        //this.members = members;
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

   /* public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
}*/

    public void display() {
        System.out.println (this.name + " " + this.date + " " + this.place + " " + this.seats+ " ");
        //System.out.println("Members: ");
        //for (Member member : members) {
           //System.out.println("Member: ");
           // System.out.println(member.firstname);
           // member.display();
      //  }
    }
}
