public class Rajon {
    private String Name;

    public Rajon(String Name){
        this.Name=Name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void GetInfo(){
        System.out.println(this.Name);
    }
}
