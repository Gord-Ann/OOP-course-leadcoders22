public class Uslugi {
   private String TipUslug;
    private int price;

    public Uslugi(String TipUslug) {

        this.TipUslug = TipUslug;
    }
 
    public Uslugi(int price) {
        this.price = price;
    }

    public String getTipUslug() {
        return TipUslug;
    }

    public void setTipUslug(String TipUslug) {
        this.TipUslug = TipUslug;
    }

    public int getprice() {
        return price;
    }

    public void setPrice(int price) {

    }

    public void GetInfo() {
        System.out.println(this.TipUslug);
    }

    public void GetInfo(int price) {
        System.out.println(this.price + "$");
    }

}