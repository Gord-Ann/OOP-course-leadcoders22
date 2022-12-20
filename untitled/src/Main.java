import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's sell your car! But first of all, please, introduce yourself... \n ");
        System.out.println("Your information: ");
        Seller seller1 = new Seller();
        seller1.inputSeller();
        Buyer buyer1 = new Buyer();
        buyer1.inputBuyer();

        System.out.println("Choose what you want to enter: 1 - notice; 2 - address; 3 - car; 4 - car certificate; 5 - car characteristics; 6 - show my documents \n");
        Scanner input = new Scanner(System.in);
        int x;
        do {
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(" Enter information about your notice ");
                    Notice notice1 = new Notice();
                    notice1.inputNotice();
                    break;

                case 2:
                    System.out.println(" Next, let's enter the address");
                    Address address1 = new Address();
                    address1.inputAddress();
                    break;

                case 3:
                    System.out.println(" Now enter the information about the car");
                    Car car1 = new Car();
                    car1.inputCar();
                    break;

                case 4:
                    System.out.println(" Enter Car Certificate ");
                    CarCertificate cs1 = new CarCertificate();
                    cs1.inputCarCertificate();
                    break;

                case 5:
                    System.out.println(" Enter Car Characteristics ");
                    CarCharacteristics cc1 = new CarCharacteristics();
                    cc1.inputCarCharacteristics();
                    break;

                case 6:
                    System.out.println(" Enter your documents: ");
                    SellerDocuments sd1 = new SellerDocuments();
                    sd1.inputSellerDocuments();
                    break;
            }
        } while (x<7);
    }
}