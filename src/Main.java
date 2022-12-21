import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Запись в клинику ");
        System.out.println("Ваши данные: ");
        
        Patient patient1 = new Patient();
        patient1.inputPatient();

        System.out.println("Введите: 1 - QR; 2 - Адрес клиники; 3 - Симптомы; 4 - Страховка; 5 - Корпус; 6 - Мои документы");
        Scanner input = new Scanner(System.in);
        int x;
        do {
            x = input.nextInt();
            switch (x) {
                case 1:
                    System.out.println(" Ввести QR ");
                    QR qr1 = new QR();
                    qr1.inputQr();
                    break;

                case 2:
                    System.out.println("Введите адрес");
                    AddressHospital addressHospital1 = new AddressHospital();
                    addressHospital1.inputAddressHospital();
                    break;

                case 3:
                    System.out.println("Введите симптомы");
                    Disease disease1 = new Disease();
                    disease1.inputDisease();
                    break;

                case 4:
                    System.out.println("Номер страховки");
                    Insurance ins1 = new Insurance();
                    ins1.inputInsurance();
                    break;

                case 5:
                    System.out.println("Введите отделение ");
                    Corps corps1 = new Corps();
                    corps1.inputCorps();
                    break;

                case 6:
                    System.out.println("Мои документы: ");
                    PatientDocs sd1 = new PatientDocs();
                    sd1.inputPatientDocs();
                    break;
            }
        } while (x<7);
    }
}