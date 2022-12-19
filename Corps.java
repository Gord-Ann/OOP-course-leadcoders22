public abstract class Corps {
    private String name;
    private int ticketTime;

    public Corps(String name, int ticketTime) {
        this.name = name;
        this.ticketTime = ticketTime;
    }
    public String getName(){
        return name;
    }
    public int getTicketTime(){
        return ticketTime;
    }
}
