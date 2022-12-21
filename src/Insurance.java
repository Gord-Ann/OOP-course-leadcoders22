import java.util.Scanner;

    public class Insurance{

        private String OMS;
        private String DMS;

        public String getOMS() {
            return OMS;
        }

        public void setOMS(String OMS) {
            this.OMS = OMS;
        }

        public String getDMS() {
            return DMS;
        }

        public void setDMS(String DMS) {
            this.DMS = DMS;
        }

        public void inputInsurance(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ОМС: ");
        String OMS = in.nextLine();
        System.out.println("Введите ДМС: ");
        String DMS = in.nextLine();
        System.out.printf("ОМС: %s, ДМС: %s \n", OMS, DMS);

    }
}
