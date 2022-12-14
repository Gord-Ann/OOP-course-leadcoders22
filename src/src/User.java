public class User {
    protected String surname;

    protected String firstname;

    protected int age;


    public User(String surname, String firstname, int age)
    {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }
    public String getFirstname() {
        return firstname;
    }
    public int getAge(){
        return age;
    }
}