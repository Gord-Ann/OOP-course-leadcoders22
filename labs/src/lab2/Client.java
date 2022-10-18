package lab2;

public class Client {
    private String name;
    private Long phone;

    public Client(String name, Long phone){
        this.name = name;
        this.phone = phone;
    }
    public Client(){
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Long getPhone(){
        return phone;
    }
    public void setPhone(Long phone) {
            this.phone = phone;
        }
}
