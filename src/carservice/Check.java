package carservice;

public class Check {
    
    private String prob;
    private int price;
    private String[] check = new String[100];

    public String getProb() {
        return prob;
    }

    public int getPrice() {
        return price;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
        
    public void setCheck(int count) {
        check[count] = prob + "/" + price;
    }

    public String[] getCheck() {
        return check;
    }
}
