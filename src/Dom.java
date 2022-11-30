public class Dom {
    private final String Adres;
    private final int Number;

    public Dom(String Adres, int Number){
        this.Adres=Adres;
        this.Number=Number;
    }

    public void setAdres(String Adres) {
        Adres = Adres;
    }

    public String getAdres() {
        return Adres;
    }

    public void setNumber(String Number) {
        Number = Number;
    }

    public int getNumber() {
        return Number;
    }

    public void GetInfo(){
        System.out.println("Adres: " + this.Adres);
        System.out.println("Number: " + this.Number);
}
}
