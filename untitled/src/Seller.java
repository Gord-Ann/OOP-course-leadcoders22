import java.util.Scanner;

class Seller extends User {

    private String surname;
    private String firstname;

    private int age;
    private int sellerID;

    public Seller(String username, String password, String surname, String firstname, int age, int sellerID) {
        super(username, password);
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.sellerID = sellerID;
    }

    public Seller() {}

    public void inputSeller(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();
        System.out.println("Enter surname: ");
        String surname1 = in.nextLine();
        System.out.println("Enter firstname: ");
        String firstname1 = in.nextLine();
        System.out.println("Enter age: ");
        int age1 = in.nextInt();
        System.out.println("Enter id: ");
        int sellerID1 = in.nextInt();
        Seller seller = new Seller(username, password, surname1, firstname1, age1, sellerID1);



        System.out.printf("Surname %s, Firstname %s, Age: %d, ID: %d \n", surname, firstname, age, sellerID);

    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSellerID() {
        return sellerID;
    }


}

