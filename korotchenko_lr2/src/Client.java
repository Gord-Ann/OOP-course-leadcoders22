public class Client {
    private String name;
    private String phone;

    public Client(String name, String phone){
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
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone) {
        if (phone.toString().length() >11){
        System.out.println("Error. Check your phone number");
    }else{
            if (phone.toString().length() <11){
                System.out.println("Error. Check your phone number");
            }
        }
    }
}