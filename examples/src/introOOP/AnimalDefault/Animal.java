package introOOP.AnimalDefault;

class Animal {

    String name;
    int age;

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Animal animal = new Animal();   //создание объекта

        animal.name = "Floppa";         //изменяем имя
        animal.age = 25;                //изменяем возраст

        animal.showInfo();              //выводим информацию об объекте на экран
    }
}
