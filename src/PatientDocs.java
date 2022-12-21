import java.util.Scanner;

public class PatientDocs {

    private int passport;

    private int snils;

    public void inputPatientDocs(){
        Scanner in = new Scanner(System.in);
        System.out.println("Серия и номер паспорта: ");
        passport = in.nextInt();
        System.out.println("Введите СНИЛС: ");
        snils = in.nextInt();

        System.out.printf("Паспорт: %d, СНИЛС: %d ", passport, snils);

    }

    public int getPassport(){
        return passport;
    }

    public int getSnils(){
        return snils;
    }
}

