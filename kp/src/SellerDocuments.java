public class SellerDocuments {

    private int serialNumber;

    private int number;

    private String FIO;

    public SellerDocuments(int serialNumber, int number, String FIO){
        this.serialNumber = serialNumber;
        this.number = number;
        this.FIO = FIO;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public int getNumber(){
        return number;
    }

    public String getFIO(){
        return FIO;
    }
}
