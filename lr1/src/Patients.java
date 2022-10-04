public class Patients {
    private String name;
    private String email;
    private Long phone;

    public Patients(String name, String email, Long phone){
        this.name = name;
        this.email = email;
        this.phone = phone;

    }
    public Patients() {
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Long getPhone(){
        return phone;
    }
    public void setPhone(Long phone) {
        if (phone !=11){
            this.phone = phone;
        }else{
            System.out.println("Error. Check your phone number");
        }
    }
}