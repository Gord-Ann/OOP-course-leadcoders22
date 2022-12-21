import java.util.Scanner;

public class QR {
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQr() {
        return qr;
    }

    public void setQr(int qr) {
        this.qr = qr;
    }
    private String description;
    private int qr;
    public void inputQr(){
        Scanner in = new Scanner(System.in);
        System.out.println("Описание: ");
        description = in.nextLine();
        System.out.println("QR: ");
        qr = in.nextInt();
        System.out.printf("Qr: %d и описание: %s \n", qr, description);
    }


}
