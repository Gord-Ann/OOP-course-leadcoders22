import java.util.Scanner;
public class Bonuses {
        public void inputBonuses(){
            System.out.println("Введите количество начисленных бонусов...");
        Scanner console = new Scanner(System.in);
        double amount = console.nextDouble();

        System.out.println("Your bonuses: " + amount);
    }
}

