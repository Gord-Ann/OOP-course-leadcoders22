package l3;

import java.util.Scanner;

public class Contract {
    private int number;
    private String work;

    public void setNumber(int number) {
        this.number=number;
    }
        public void inputNumber(){
        System.out.println("Assigning a number contract...");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        System.out.println("Number contract:" + number);
    }

    public void setWork(String work) {
        this.work = work;
    }


}










