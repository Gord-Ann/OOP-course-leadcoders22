import java.util.Scanner;

class Patient extends User {

    private String surname;
    private String firstname;

    private int age;
    private int patientID;

    public Patient(String username, String password, String surname, String firstname, int age, int patientID) {
        super(username, password);
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.patientID = patientID;
    }

    public Patient() {}

    public void inputPatient(){
        Scanner in = new Scanner(System.in);
        System.out.println("Логин: ");
        String username = in.nextLine();
        System.out.println("Пароль: ");
        String password = in.nextLine();
        System.out.println("Имя: ");
        String surname2 = in.nextLine();
        System.out.println("Фамилия: ");
        String firstname2 = in.nextLine();
        System.out.println("Возраст: ");
        int age2 = in.nextInt();
        System.out.println("ID: ");
        int patientID2 = in.nextInt();
        Doctor doctor = new Doctor(username, password, surname2, firstname2, age2, patientID2);



        System.out.printf("Фамилия %s, Имя %s, Возраст: %d, ID: %d", surname, firstname, age, patientID2);

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

    public int getPatientID() {
        return patientID;
    }


}

