package lab3;
import java.util.List;
class Conference extends Event{


    private List<Member> membersconf;

    public Conference (String name, String date, String place, int seats, List<Member> membersconf) {
        super(name, date, place, seats);
        this.membersconf = membersconf;
    }
    public List<Member> getMembersconf() {
        return membersconf;
    }

    public void setMembersconf(List<Member> membersconf) {
        this.membersconf = membersconf;
    }

    @Override
    public void display(){
        System.out.println (this.name + " " + this.date + " " + this.place + " " + this.seats+ " ");
        System.out.println("Members: ");
        for (Member member : membersconf) {
            member.display();
        }
    }
}
