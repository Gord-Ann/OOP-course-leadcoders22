package lab2;

public class Salon {
    private String otdelka;
    private String kresla;
    private int mesta;

    public Salon(String otdelka, String kresla, int mesta) {
        this.otdelka = otdelka;
        this.kresla = kresla;
        this.mesta = mesta;
    }
    public String getOtdelka() {
        return otdelka;
    }

    public void setOtdelka(String otdelka) {
        this.otdelka = otdelka;
    }

    public String getKresla() {
        return kresla;
    }

    public void setKresla(String kresla) {
        this.kresla = kresla;
    }
    public int getMesta() {
        return mesta;
    }

    public void setMesta(int mesta) {
        this.mesta = mesta;
    }
}

