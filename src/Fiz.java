public class Fiz {
    private String FIO;

    public Fiz(String FIO){
        this.FIO=FIO;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public void GetInfo(){
        System.out.println(this.FIO);
    }
}
