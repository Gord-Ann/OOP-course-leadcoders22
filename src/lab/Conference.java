package lab;
import java.util.List;
class Conference extends Event {
    private String theme;
    public Conference(String name, String date, String theme, String place, int seats, List<Member> members, List<Expert> experts) {
        super(name, date, place, seats, members, experts);
        this.theme = theme;
    }
    @Override
    public void display() {
        System.out.println("CONFERENCE ");
        System.out.println("Title: " + this.name);
        System.out.println("Data: " + this.date);
        System.out.println("Subject matter: " + this.theme);
        System.out.println("Venue: " + this.place);
        System.out.println("Number of seats: " + this.seats);
        System.out.println("Exrept: ");
        for (Expert expert: experts){
            expert.display();
        }
        System.out.println("Members: ");
        for (Member member : members) {
            member.display();
        }
    }
}

