package l3;

public class GazCompany extends Contractor {
    private final int tubeLenght;

    public GazCompany(String name, String address, long phone, String mail,int tubeLenght) {
        super(name, address, phone, mail);
        this.tubeLenght= tubeLenght;    }

    public int getTubeLenght() {
        return tubeLenght;}

    @Override
    public void display() {
        System.out.println("Contractor:" + this.name);
        System.out.println("Tube lenght:" + this.tubeLenght+" meters");
        System.out.println("Address:" + this.address + " ");
        System.out.println("Contact:" + "phone:" + this.phone + " " + "mail:" + this.mail);
    }
}

