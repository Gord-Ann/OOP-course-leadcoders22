package l3;

public abstract class Contractor {
    private String name;
    private String address;
    private int phone;
    private String mail;

    public Contractor(String name, String address, int phone, String mail){
        this.name=name;
        this.address=address;
        this.phone=phone;
        this.mail=mail;
    }
    public void display() {
        System.out.println(this.name + " "+ this.address + " " + this.phone + " " + this.mail );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
