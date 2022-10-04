public class Room {
    private String name;
    private int square;
    private int rent;

    public Room(String name, int square, int rent) {
        this.name=name;
        this.square=square;
        this.rent=rent;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public int getSquare() { return this.square;}
    public void setSquare(int square) {
        this.square=square;
    }
    public int getRent() { return this.rent;}
    public void setRent(int rent) {
        this.rent=rent;}
}
