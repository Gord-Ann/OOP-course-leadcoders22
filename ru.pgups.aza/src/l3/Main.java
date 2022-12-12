package l3;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Contract contract = new Contract();
            contract.inputNumber();

            Employee alexander = new Employee("Alexander,", "manager,", 89889928393L, "alexCom@yandex.ru");
            alexander.display();

            Contractor gazMash = new Company("Gazmash", "Safrinovskaya 43", 89365773667L, "gazma@mail.ru");
            gazMash.display();

            Work work = new Work("repair", 5000000);
            work.display();

        }
}





