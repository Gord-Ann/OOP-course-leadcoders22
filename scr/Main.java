public class Main {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Ivanov", "Ivan", 10, 10, 1980);
        System.out.println("Doctor surname - " + d1.getSurname() + "; name - " + d1.getName());
        System.out.println("Doctor birth day - " + d1.getBirthDay() + "; month - " + d1.getBirthMonth() + "; year - " + d1.getBirthYear());

        Hospital h1 = new Hospital();
        h1.inputHospital();

        Info i1 = new Info();
        i1.inputInfo();

        Procedure pr1 = new Procedure("PCR TEST", 1);
        System.out.println("Your procedure name is - " + pr1.getName() + "; Your procedure time is - " + pr1.getProcedureTime() + " hours");

        Patients p1 = new Patients("Sokolov", "Ivan", 10, 10, 2000, 1);
        System.out.println("Patients surname - " + p1.getSurname() + "; name - " + p1.getName());
        System.out.println("Patients birth day - " + p1.getBirthDay() + "; month - " + p1.getBirthMonth() + "; year - " + p1.getBirthYear());
        System.out.println("Patients Id - " + p1.getPatientId());

        Status s1 = new Status();
        s1.inputStatus();

        Insurance i1 = new Insurance();
        i1.inputInsurance();
    }
}
