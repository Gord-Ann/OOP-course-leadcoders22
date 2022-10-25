package lab2;

public class Repair {
    private int maslo;
    private int dvig;
    private int shpak;

    public Repair(int maslo, int dvig, int shpak) {
        this.maslo = maslo;
        this.dvig = dvig;
        this.shpak = shpak;
    }
    public int getMaslo() {
        return maslo;
    }

    public void setMaslo(int maslo){
        this.maslo = maslo;
    }
    public int getDvig() {
        return dvig;
    }

    public void setDvig (int dvig){
        this.dvig = dvig;
    }
    public int getShpak() {
        return shpak;
    }

    public void setShpak (int shpak){
        this.shpak = shpak;
    }
}

