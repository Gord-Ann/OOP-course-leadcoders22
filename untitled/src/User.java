import java.util.Scanner;

public class User {
    public void inputUser() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = in.nextLine();
        System.out.println("Enter firstname: ");
        String firstname = in.nextLine();
        System.out.println("Enter age: ");
        int age = in.nextInt();

        System.out.printf("Surname %s, Firstname %s, Age: %d \n", surname, firstname, age);
    }
}