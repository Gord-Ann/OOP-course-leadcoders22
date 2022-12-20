import java.util.Scanner;

public class SellerDocuments {

    private int serialNumber;

    private int number;

    public void inputSellerDocuments(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter serial number: ");
        serialNumber = in.nextInt();
        System.out.println("Enter number: ");
        number = in.nextInt();

        System.out.printf("Serial Number: %d, Number: %d \n", serialNumber, number);

    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public int getNumber(){
        return number;
    }
}

