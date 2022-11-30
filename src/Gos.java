public class Gos {
    private String Struktura;

    public void Struktura(String Struktura){
        this.Struktura=Struktura;
    }

    public String getStruktura() {
        return Struktura;
    }

    public void setStruktura(String Struktura) {
        this.Struktura = Struktura;
    }

    public void GetInfo(){
        System.out.println(this.Struktura);
    }
}
