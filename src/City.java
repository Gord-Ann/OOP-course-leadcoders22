public class City {
    private String name;

    public City(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

    public void getInfo(){
        System.out.println(this.name);
    }
}
