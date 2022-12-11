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
        super.display();
        System.out.println("Members: ");
        for (Member member : membersconf) {
            //System.out.println("Member: ");
            // System.out.println(member.firstname);
            member.display();
        }
    }
}
