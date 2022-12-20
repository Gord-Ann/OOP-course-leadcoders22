import java.util.Scanner;

class Buyer extends User {

    private String surname;
    private String firstname;

    private int age;
    private int buyerID;

    public Buyer(String username, String password, String surname, String firstname, int age, int buyerID) {
        super(username, password);
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.buyerID = buyerID;
    }

    public Buyer() {}

    public void inputBuyer(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = in.nextLine();
        System.out.println("Enter password: ");
        String password = in.nextLine();
        System.out.println("Enter surname: ");
        String surname2 = in.nextLine();
        System.out.println("Enter firstname: ");
        String firstname2 = in.nextLine();
        System.out.println("Enter age: ");
        int age2 = in.nextInt();
        System.out.println("Enter id: ");
        int buyerID2 = in.nextInt();
        Seller seller = new Seller(username, password, surname2, firstname2, age2, buyerID2);



        System.out.printf("Surname %s, Firstname %s, Age: %d, ID: %d \n", surname, firstname, age, buyerID2);

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

    public int getBuyerID() {
        return buyerID;
    }


}

