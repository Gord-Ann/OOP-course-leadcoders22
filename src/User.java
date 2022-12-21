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
        System.out.println("Логин: ");
        username = in.nextLine();
        System.out.println("Пароль: ");
        password = in.nextLine();

        System.out.printf("Логин %s, Пароль %s ", username, password);






    }
}