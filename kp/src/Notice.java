import java.util.Scanner;

public class Notice {
    public void inputNotice(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input price: ");
        int price = in.nextInt();
        System.out.println("Input description: ");
        String description = in.nextLine();
        System.out.printf("Car price: %d and description: %s", price, description);
    }
}