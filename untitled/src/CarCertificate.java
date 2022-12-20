import java.util.Scanner;

    public class CarCertificate{

        private String vinNumber;
        private String carPlateNumber;

        public String getVinNumber() {
            return vinNumber;
        }

        public void setVinNumber(String vinNumber) {
            this.vinNumber = vinNumber;
        }

        public String getCarPlateNumber() {
            return carPlateNumber;
        }

        public void setCarPlateNumber(String carPlateNumber) {
            this.carPlateNumber = carPlateNumber;
        }

        public void inputCarCertificate(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input VIN-number: ");
        String vinNumber = in.nextLine();
        System.out.println("Input car plate number: ");
        String carPlateNumber = in.nextLine();
        System.out.printf("VIN-number: %s, Car Plate: %s \n", vinNumber, carPlateNumber);

    }
}
