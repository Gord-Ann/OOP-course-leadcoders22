package lab3;


import java.util.ArrayList;
import java.util.List;

class Member extends User {
    private static List members;
    public Member(String lastname, String firstname, String patronymic, String email) {
        super(lastname, firstname, patronymic, email);
        List members = new ArrayList<>();
    }

    @Override
    public void display() {
        super.display();
    }
@Override
    public void getList() {
        System.out.println(this.lastname+ " "+ this.firstname+ " " + this.patronymic+ " " + this.email);
}
}

