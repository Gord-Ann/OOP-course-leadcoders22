public class Main {
    public static void main(String[] args) {
        Doctor e1 = new Doctor("Ivanov", "Ivan", 10, 10, 1980);
        System.out.println("Doctor surname - " + e1.getSurname() + "; name - " + e1.getName());
        System.out.println("Doctor birth day - " + e1.getBirthDay() + "; month - " + e1.getBirthMonth() + "; year - " + e1.getBirthYear());

        Hospital t1 = new Hospital();
        t1.inputHospital();

        Info i1 = new Info();
        i1.inputInfo();

        Procedure tr1 = new Procedure("PCR TEST", 1);
        System.out.println("Your procedure name is - " + tr1.getName() + "; Your procerure time is - " + tr1.getProcerureTime() + " hours");

        Patients c1 = new Patients("Sokolov", "Ivan", 10, 10, 2000, 1);
        System.out.println("Patients surname - " + c1.getSurname() + "; name - " + c1.getName());
        System.out.println("Patients birth day - " + c1.getBirthDay() + "; month - " + c1.getBirthMonth() + "; year - " + c1.getBirthYear());
        System.out.println("Patients Id - " + c1.getPatientId());

        Status s1 = new Status();
        s1.inputStatus();

        Insurance b1 = new Insurance();
        b1.inputInsurance();
    }
}
