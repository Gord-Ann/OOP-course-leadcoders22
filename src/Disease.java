import java.util.Scanner;

public class Disease {

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiagnosisType() {
        return diagnosisType;
    }

    public void setdiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    private String type;
    private String diagnosisType;
    private int temperature;
    public void inputDisease(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите тип: ");
        type = in.nextLine();
        System.out.println("Введите диагноз: ");
        diagnosisType = in.nextLine();
        System.out.println("введите температуру: ");
        temperature = in.nextInt();
        System.out.printf("Температура: %d, Тип: %s, Диагноз: %s \n", temperature, type, diagnosisType);
    }
}
