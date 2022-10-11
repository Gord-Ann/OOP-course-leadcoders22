package lab2;

public class Client {
    private String surname;
    private String name;
    private String patronymic;
    private int age;
    private String gender;


    public Client (String surname, String name,String patronymic, int age, String gender) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;

    }
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
