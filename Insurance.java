import java.util.Scanner;
public class Insurance {
        public void inputInsurance(){
            System.out.println("Введите тип страховки...");
        Scanner console = new Scanner(System.in);
        double amount = console.nextDouble();

        System.out.println("Your insurance: " + amount);
    }
}
