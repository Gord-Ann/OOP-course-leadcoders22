package lab3;


import java.util.List;

class Training extends Event {


    private List<Member> memberstr;
    public Training (String name, String date, String place, int seats,List<Member> membertr) {
        super(name,date, place, seats);
        this.memberstr = membertr;

    }
    public List<Member> getMemberstr() {
        return memberstr;
    }

    public void setMemberstr(List<Member> memberstr) {
        this.memberstr = memberstr;
    }
    @Override
    public void display(){
        System.out.println (this.name + " " + this.date + " " + this.place + " " + this.seats+ " ");
        System.out.println("Members: ");
        for (Member member : memberstr) {
            member.display();
        }
    }

}
