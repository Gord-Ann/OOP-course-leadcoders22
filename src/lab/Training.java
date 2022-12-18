package lab;


import java.util.List;

class Training extends Event {
    private int hours;
    public Training (String name, String date, String place, int hours, int seats,List<Member> members, List<Expert> experts) {
        super(name,date, place, seats, members, experts);
        this.hours = hours;
            }
    @Override
    public void display(){
        System.out.println("TRAINING ");
        System.out.println("Title: " + this.name);
        System.out.println("Data: " + this.date);
        System.out.println("Venue: " + this.place);
        System.out.println("Duration: " + this.hours +" hours");
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

