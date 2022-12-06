public class Person {
    protected String surname;
    protected String name;
    protected int birthDate;

    public Person (String surname, String name, int birthDate){
        this.surname = surname;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getSurname(){
        return surname;
    }
    public String getName() {
        return name;
    }
    public int getBirthDate() {
        return birthDate;
    }
}
