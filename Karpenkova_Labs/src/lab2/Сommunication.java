package lab2;

public class Сommunication {
    private String email;
    private int phoneNumber;


    public Сommunication(String email, int phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
