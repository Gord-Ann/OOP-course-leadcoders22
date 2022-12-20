import java.util.Scanner;

public class User {

    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public void inputUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        username = in.nextLine();
        System.out.println("Enter password: ");
        password = in.nextLine();

        System.out.printf("Username %s, Password %s \n", username, password);






    }
}