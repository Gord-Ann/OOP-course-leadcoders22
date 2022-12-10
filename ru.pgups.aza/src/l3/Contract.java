package l3;

import java.util.Scanner;

public class Contract {
    private int number;
    private Work work;
    private Contractor contractor;
    private Employee employee;

    public void setContractor() {
        this.contractor = contractor;
    }
    public void setWork(Work work) {
        this.work = work;
    }
    public Contractor getContractor() {
        return contractor;
    }


    public void setNumber() {
        System.out.println("Assigning a number contract...");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println("Number contract:" + number);
    }

    public void setWork() {
        Work work = new Work("repair", 500000);
        System.out.println("view:" + work.getView());
        System.out.println("cost:" + work.getCost());
        System.out.println();
    }

    public void setEmployee() {
        this.employee = employee;
    }
    Employee alexander = new Employee("Alexander", "manager", 89889928393L, "alexCom@yandex.ru");{
        System.out.println("Employee:");
        alexander.display();
}

}





