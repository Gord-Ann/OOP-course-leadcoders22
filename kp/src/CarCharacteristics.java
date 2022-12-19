import java.util.Scanner;

public class CarCharacteristics {
    public void inputCarCharacteristics(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input horse power: ");
        int horsePower = in.nextInt();
        System.out.println("Input body type: ");
        String bodyType = in.nextLine();
        System.out.println("Input transmission type: ");
        String transmissionType = in.nextLine();
        System.out.printf("Horse power: %d, Street name: %s, Transmission type: %s", horsePower, bodyType, transmissionType);
    }
}
