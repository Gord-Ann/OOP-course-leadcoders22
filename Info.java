import java.util.Scanner;
public class Info {
    public void inputInfo(){
        System.out.println("Введите паспорт, СНИЛС, ПОЛИС...");
        Scanner console = new Scanner(System.in);

        int passport = console.nextInt();
        int snils = console.nextInt();
        int policy= console.nextInt();

        System.out.println("Passport: " + passport);
        System.out.println("Snils: " + snils);
        System.out.println("Policy: " + policy);
       
    }
}
