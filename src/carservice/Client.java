package carservice;

public class Client {
   
    private String[] clients = new String[100];
    private String FIO;
    private int num;
    private String prob;

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getProb() {
        return prob;
    }

    public void setProb(String prob) {
        this.prob = prob;
    }

    public void setClient() {
        clients[num] = FIO + "/" + num + "/" + prob;
    }

    public String[] getClient() {
        return clients;
    }
}
