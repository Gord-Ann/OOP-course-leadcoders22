package introOOP.AnimalWithConstructor;

public class Animal {

    String name;
    int age;

    public Animal() {
        this.name = "Floppa";
        this.age = 17;
    }

    public Animal(int age) {
        this.name = "Ignat";
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Animal floppa = new Animal();                       //вызов конструктора без параметров
        floppa.showInfo();

        Animal ignat = new Animal(15);                   //вызов конструктора с одним параметром
        ignat.showInfo();

        Animal natasha = new Animal("Natasha", 20);   //вызов конструктора с двумя параметрами
        natasha.showInfo();
    }
}