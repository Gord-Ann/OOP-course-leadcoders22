import java.util.Scanner;
public class Hospital {
    public void inputHospital(){
        System.out.println("Введите данные о записи: город, район, время и цену");
        Scanner console = new Scanner(System.in);
        String city = console.nextLine();
        String district = console.nextLine();
        int time = console.nextInt();
        int price = console.nextInt();

        System.out.println("City: " + city);
        System.out.println("District: " + district);
        System.out.println("Time: " + time);
        System.out.println("Price: " + price);
    }
}
