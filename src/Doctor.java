import java.util.Scanner;

class Doctor extends User {

    private String surname;
    private String firstname;

    private int age;
    private int doctorID;

    public Doctor(String username, String password, String surname, String firstname, int age, int doctorID) {
        super(username, password);
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.doctorID = doctorID;
    }

    public Doctor() {}

    public void inputDoctor(){
        Scanner in = new Scanner(System.in);
        System.out.println("Логин: ");
        String username = in.nextLine();
        System.out.println("Пароль: ");
        String password = in.nextLine();
        System.out.println("Фамилия: ");
        String surname1 = in.nextLine();
        System.out.println("Имя: ");
        String firstname1 = in.nextLine();
        System.out.println("Возраст: ");
        int age1 = in.nextInt();
        System.out.println("id: ");
        int doctorID1 = in.nextInt();
        Doctor doctor = new Doctor(username, password, surname1, firstname1, age1, doctorID1);



        System.out.printf("Фамилия %s, Имя %s, Возраст: %d, ID: %d \n", surname, firstname, age, doctorID);

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

    public int getDoctorID() {
        return doctorID;
    }


}

