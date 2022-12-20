import java.util.Scanner;

public class Address {
    public void inputAddress() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input City name: ");
        String cityName = in.nextLine();
        System.out.println("Input Street name: ");
        String streetName = in.nextLine();
        System.out.println("Input House number: ");
        int houseNum = in.nextInt();
        System.out.printf("City name: %s Street name: %s House Number: %d \n", cityName, streetName, houseNum);
    }
}


