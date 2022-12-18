package l3;

public class OilCompany extends Contractor {
private final int volumeTank;

    public OilCompany(String name, String address, long phone, String mail,int volumeTank) {
        super(name, address, phone, mail);
        this.volumeTank= volumeTank;
    }

    public int getVolumeTank() {
        return volumeTank;
    }

    @Override public void display() {
        System.out.println("Contractor:" + this.name );
        System.out.println("Volume tank:"+ this.volumeTank+" barrel");
        System.out.println("Address:" + this.address );
        System.out.println("Contact:" + "phone:" + this.phone + " " + "mail:" + this.mail);
    }

}
