public abstract class Person {
    protected String surname;
    protected String name;
    protected int birthDay;
    protected int birthMonth;
    protected int birthYear;

    public Person(String surname, String name, int birthDay, int birthMonth, int birthYear) {
        this.surname = surname;
        this.name = name;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }
}