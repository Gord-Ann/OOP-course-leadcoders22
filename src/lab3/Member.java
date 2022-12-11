package lab3;

class Member extends User {

    public Member(String lastname, String firstname, String patronymic, String email) {
        super(lastname, firstname, patronymic, email);

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

