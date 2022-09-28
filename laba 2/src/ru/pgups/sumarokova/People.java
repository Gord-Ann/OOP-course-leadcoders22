package ru.pgups.sumarokova;

public class People {

    private String name;
    private int age;
    private String department;
    private String position;

    public People(String name, int age, String department, String position){
        this.name = name;
        this.age = age;
        this.department = department;
        this.position  = position;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age) {

        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error. Insert the correct value");
        }

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

class MainPeople {
    public static void main(String[] args){
        People Ivan = new People("Ivan", 45, "technical department","manager");
        System.out.println("Name: " + Ivan.getName());
        System.out.println("Age: " + Ivan.getAge());
        System.out.println("Department: " + Ivan.getDepartment());
        System.out.println("Position: " + Ivan.getPosition());

        //Ivan.setName("CBA");
        System.out.println("Name: " + Ivan.getName());

        Ivan.setAge(48);
        System.out.println("Age: " + Ivan.getAge());

        //Ivan.setDepartment();
        System.out.println("Department: " + Ivan.getDepartment());

        Ivan.setPosition("general manager");
        System.out.println("Position: " + Ivan.getPosition());

        People Kim = new People("Kim", 30, "finance department","accountant");
        System.out.println("Name: " + Kim.getName());
        System.out.println("Age: " + Kim.getAge());
        System.out.println("Department: " + Kim.getDepartment());
        System.out.println("Position: " + Kim.getPosition());

    }


}