public class User extends NewUser {

    private int numberOfHits;


    public User(String surname, String name, String email, String login, int password , int numberOfHits) {
        super(surname, name, email, login, password);
        this.numberOfHits = numberOfHits;
    }

    @Override
    public void display() {
        System.out.println("Login: " + getLogin());
        System.out.println("Password: " + getPassword());
        System.out.println("Number Of Hits: " + this.numberOfHits);
    }
}
