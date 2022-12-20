import java.util.Scanner;

public class CarCharacteristics {

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    private String bodyType;
    private String transmissionType;
    private int horsePower;
    public void inputCarCharacteristics(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input body type: ");
        bodyType = in.nextLine();
        System.out.println("Input transmission type: ");
        transmissionType = in.nextLine();
        System.out.println("Input horse power: ");
        horsePower = in.nextInt();
        System.out.printf("Horse power: %d, Street name: %s, Transmission type: %s \n", horsePower, bodyType, transmissionType);
    }
}
