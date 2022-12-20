import java.util.Scanner;

class Buyer extends User {

    public void inputBuyer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter surname: ");
        String surname = in.nextLine();
        System.out.println("Enter firstname: ");
        String firstname = in.nextLine();
        System.out.println("Enter age: ");
        int age = in.nextInt();
        System.out.println("Enter id: ");
        int buyerID = in.nextInt();

        System.out.printf("Surname %s, Firstname %s, Age: %d, ID: %d \n", surname, firstname, age, buyerID);

    }
}