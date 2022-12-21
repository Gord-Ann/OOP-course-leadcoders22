import java.util.Scanner;

public class Corps {

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }


    public int getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(int ticketTime) {
        this.ticketTime = ticketTime;
    }


    private String corpName;
    private int ticketTime;
    public void inputCorps() {
        Scanner in = new Scanner(System.in);
        System.out.println("Отделение: ");
        corpName = in.nextLine();
        
        System.out.println("Время талона: ");
        ticketTime = in.nextInt();
    
        System.out.printf("Отделение: %s, Время талона: %d,\n", corpName,  ticketTime);
    }
}