package introOOP.principlesOOP;

public class Animal {

    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


class MainAnimal {
    public static void main(String[] args) {
        Animal floppa = new Animal("Floppa", 20);
        System.out.println("Floppa's name: " + floppa.getName());
        System.out.println("Floppa's age: " + floppa.getAge());

        floppa.setAge(21);
        System.out.println("Floppa turns: " + floppa.getAge());

        floppa.setName("Ignat");
        System.out.println("Floppa has another name: " + floppa.getName());
    }
}

