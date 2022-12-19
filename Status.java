import java.util.Scanner;
public class Status {
        public void inputStatus (){
            System.out.println("Введите статус заказа...");
        Scanner console = new Scanner(System.in);
        String status = console.nextLine();

        System.out.println("Your order status: " + status);
    }
}
