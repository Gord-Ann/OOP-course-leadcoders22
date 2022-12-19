import java.util.Scanner;

    public class CarCertificate{
        public void inputCarCertificate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input VIN-number: ");
        String vinNumber = in.nextLine();
        System.out.println("Input car plate number: ");
        String carPlateNumber = in.nextLine();
        System.out.printf("VIN-number: %s, Car Plate: %s", vinNumber, carPlateNumber);
    }
}
