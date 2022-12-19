import java.util.Scanner;
public class Tour {
    public void inputTour(){
        System.out.println("Введите данные о путёвке: страну, город, безопасность и цену");
        Scanner console = new Scanner(System.in);
        String country = console.nextLine();
        String city = console.nextLine();
        int safety = console.nextInt();
        int price = console.nextInt();

        System.out.println("Country: " + country);
        System.out.println("City: " + city);
        System.out.println("Safety: " + safety);
        System.out.println("Price: " + price);
    }
}

