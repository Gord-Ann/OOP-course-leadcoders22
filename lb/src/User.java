public class User {

    private String login;
    private int password;
    private int numberOfHits;


    public User(String login, int password , int numberOfHits) {
        this.login = login;
        this.password = password;
        this.numberOfHits = numberOfHits;
    }

    public void display() {
        System.out.println("Login: " + this.login);
        System.out.println("Password: " + this.password);
        System.out.println("Number Of Hits: " + this.numberOfHits);
    }
}
