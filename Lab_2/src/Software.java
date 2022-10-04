public class Software {
    private String name;
    private int number;
    private int version;

    public Software(String name, int number, int version) {
        this.name=name;
        this.number=number;
        this.version=version;
    }

    public String getName() { return this.name;}
    public void setName(String name) {
        this.name=name;
    }
    public int getNumber() { return this.number;}
    public void setNumber(int number) {
        this.number=number;
    }
    public int getVersion() { return this.version;}
    public void setVersion(int version) {
        this.version=version;}
}
