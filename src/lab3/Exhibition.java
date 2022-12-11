package lab3;

import java.util.List;

class Exhibition extends Event{


    private List<Member> membersexh;

    public Exhibition (String name, String date, String place, int seats, List<Member> membersexh) {
        super(name, date, place, seats);
        this.membersexh = membersexh;
    }

    public List<Member> getMembersexh() {
        return membersexh;
    }

    public void setMembersexh(List<Member> membersexh) {
        this.membersexh = membersexh;
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Members: ");
        for (Member member : membersexh) {
            member.display();
        }
    }
}
