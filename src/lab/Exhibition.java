package lab;

import java.util.List;

class Exhibition extends Event {

   private String format;

    public Exhibition(String name, String date, String format, String place, int seats, List<Member> members, List<Expert> experts) {
        super(name, date, place, seats, members, experts);
        this.format = format;
    }
    @Override
    public void display() {
        System.out.println("EXHIBITION ");
        System.out.println("Title: " + this.name);
        System.out.println("Data: " + this.date);
        System.out.println("Format of the event: " + this.format);
        System.out.println("Venue: " + this.place);
        System.out.println("Number of seats: " + this.seats);
        System.out.println("Expert: ");
        for (Expert expert: experts){
            expert.display();
        }
        System.out.println("Members: ");
        for (Member member : members) {
            member.display();
        }
    }
}
