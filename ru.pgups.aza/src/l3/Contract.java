package l3;

import java.util.Scanner;

public class Contract {
         private int number;
         private Work work;

         public Contractor getContractor() {
        return contractor;
    }
    public void setContractor(Contractor contractor) {
        this.contractor = contractor;
    }

    private Contractor contractor;
         private Employee employee;


    public void setNumber() {
        System.out.println("Assigning a number...");
        Scanner console = new Scanner(System.in);
        int number= console.nextInt();
        System.out.println("Number:"+ number);
    }

    public void setWork() {
        Work work = new Work("repair", 500000);
        System.out.println("view:" + work.getView());
        System.out.println("cost:" + work.getCost());
        System.out.println();
    }

 }



