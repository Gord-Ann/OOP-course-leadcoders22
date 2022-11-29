package l3;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Contractor gazMash = new Company("Gazmash", "Safrinovskaya 43", 37288367, "gazma@mail.ru");
            gazMash.display();

            Contract contract = new Contract();
            contract.setContractor(gazMash);
        }
}



