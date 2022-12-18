package lab;

class Member extends User {
    private String email;

    public Member(String lastname, String firstname, String patronymic, String email) {
        super(lastname, firstname, patronymic);
        this.email=email;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public void display() {
        System.out.println(this.lastname+ " "+ this.firstname+ " " + this.patronymic+ ", "+ "Email: "+ this.email);
    }
}

