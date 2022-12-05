package lab3;

public abstract class User {
    protected String lastname;
    protected String firstname;
    protected String patronymic;
    protected String email;

    public User(String lastname, String firstname, String patronymic, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.email = email;
    }

    public void display(){
        System.out.println(this.lastname+ " "+ this.firstname+ " " + this.patronymic+ " " + this.email);
    }

    public abstract void getList();
}
