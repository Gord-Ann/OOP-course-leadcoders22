package lab;

public abstract class User {
    protected String lastname;
    protected String firstname;
    protected String patronymic;

    public User(String lastname, String firstname, String patronymic) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    public abstract void display();
}