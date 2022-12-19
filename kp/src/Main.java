public class Main {
    public static void main(String[] args) {
        Seller seller1 = new Seller("Alexeev", "Alexey", 34, 434243);
        System.out.printf("Hello, %s %s! Your age %d. Your ID: %d", seller1.getSurname(), seller1.getFirstname(), seller1.getAge(), seller1.getSellerId() );
        System.out.println(" Let's sell your car!");

        SellerDocuments sd1 = new SellerDocuments(4000, 231563, "Alexeev Alexey Alexeevich");
        System.out.println("Let's check your documents");
        System.out.printf("Your serial number: %d, Your number: %d, Your FIO: %s", sd1.getSerialNumber(), sd1.getNumber(), sd1.getFIO());

        System.out.println("Enter information about your notice");
        Notice notice1 = new Notice();
        notice1.inputNotice();

        System.out.println("Next, let's enter the address");
        Address address1 = new Address();
        address1.inputAddress();

        System.out.println("Now enter the information about the car");
        Car car1 = new Car();
        car1.inputCar();

        System.out.println("Enter Car Certificate");
        CarCertificate cs1 = new CarCertificate();
        cs1.inputCarCertificate();

        System.out.println("Enter Car Characteristics");
        CarCharacteristics cc1 = new CarCharacteristics();
        cc1.inputCarCharacteristics();

        System.out.println("You have entered all the information! And.........");

        System.out.println("We have found a buyer!");
        Buyer buyer1 = new Buyer("Valentinov", "Valentin", 19, 142142);
        System.out.println("Surname: " + buyer1.getSurname());
        System.out.println("Firstname: " + buyer1.getFirstname());
        System.out.println("Birthdate: " + buyer1.getAge());
        System.out.println("ClientID: " + buyer1.getBuyerId());

    }
}