package lab;

class Expert extends User{
    private String role;

    public Expert(String lastname, String firstname, String patronymic,String role) {
        super(lastname, firstname, patronymic);
        this.role = role;
    }

    public void display() {
        System.out.println(this.lastname+ " "+ this.firstname+ " " + this.patronymic+ ", Role at the event: "+ this.role);
    }
}

