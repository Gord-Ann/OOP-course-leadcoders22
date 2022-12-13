package l3;

public abstract class Contractor {
    protected String name;
    protected String address;
    protected long phone;
    protected String mail;

    public Contractor(String name, String address, long phone, String mail) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mail = mail;
    }
     public Contractor(){
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

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public abstract void display();
}
