package l3;

public class Company extends Contractor {

    public Company(String name, String address, int phone, String mail) {
        super(name, address, phone, mail);
    }

    @Override
    public void display() {
        super.display();
    }

    public void setEmployee() {
        Employee employee = new Employee("Dmitry", "Director", 5726847, "dmitry@mail.ru");
        System.out.println("name:" + employee.getName());
        System.out.println("post:" + employee.getPost());
        System.out.println("number:" + employee.getNumber());
        System.out.println("mail:" + employee.getMail());
        System.out.println();
    }
}
