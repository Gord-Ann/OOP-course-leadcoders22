package l2;

public class staff {
    private String  name;
    private int age;
    void  showInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        staff staff = new staff();

        staff.name = "Ekaterina";
        staff.age = 22;

        staff.showInfo();
    }
}

