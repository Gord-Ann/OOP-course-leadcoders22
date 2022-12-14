public class Main {

    public static void main (String [] args) {
        Address address1 = new Address("Saint-Petesburg","nab. Obvodnogo Kanala", 5);
        System.out.println("City: " + address1.getCity());
        System.out.println("Street: " + address1.getStreet());
        System.out.println("Number: " + address1.getHouseNum());

        Buyer buyer1 = new Buyer("Valentinov", "Valentin", 19, 142142);
        System.out.println("Surname: " + buyer1.getSurname());
        System.out.println("Firstname: " + buyer1.getFirstname());
        System.out.println("Birthdate: " + buyer1.getAge());
        System.out.println("ClientID: " + buyer1.getBuyerId());

        Car car1 = new Car("Subaru", "Legacy", 2002, 160000);
        System.out.println("Car Name: " + car1.getCarName());
        System.out.println("Car Model: " + car1.getCarModel());
        System.out.println("Car year: " + car1.getCarYear());
        System.out.println("Odometer: " + car1.getOdometerAmount());

        CarCharestics cc1 = new CarCharestics(160, 2459, "saloon", "awd");
        System.out.println("horse power: " + cc1.getHorsePower());
        System.out.println("engine capacity: " + cc1.getEngineCapacity());
        System.out.println("body type: " + cc1.getBodyType());
        System.out.println("transmission type: " + cc1.getTransmissionType());

        CarDocuments cd1 = new CarDocuments("MVD", 1001, "ULITSTA", 4000, 40000);
        System.out.println("Whoissued: " + cd1.getWhoIssued());
        System.out.println("WhoIssuedID: " + cd1.getWhoIssuedId());
        System.out.println("Reg address: " + cd1.getRegistrationAddress());
        System.out.println("S Numb: " + cd1.getSerialNumber());
        System.out.println("Numb: " + cd1.getSerialNumber());

        Notice notice1 = new Notice(1000, 150000, "Very good car. Bez torga");
        System.out.println("Notice ID: " + notice1.getNoticeId());
        System.out.println("Price: " + notice1.getPrice());
        System.out.println("Description: " + notice1.getDescription());

        PersonDocuments pd1 = new PersonDocuments("MVD 2", 5421, "prospekt", 6531, 762465);
        System.out.println("Whoissued: " + pd1.getWhoIssued());
        System.out.println("WhoIssuedID: " + pd1.getWhoIssuedId());
        System.out.println("Reg address: " + pd1.getRegistrationAddress());
        System.out.println("S Numb: " + pd1.getSerialNumber());
        System.out.println("Numb: " + pd1.getSerialNumber());

        Seller seller1 = new Seller("Alexeev", "Alexey", 34, 434243);
        System.out.println("surname: " + seller1.getSurname());
        System.out.println("firstname: " + seller1.getFirstname());
        System.out.println("age: " + seller1.getAge());
        System.out.println("seller id: " + seller1.getSellerId());

    }
}