package l3;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Contract contract = new Contract();
            contract.setContractor();
            contract.setNumber();

                Contractor gazMash = new Company("Gazmash", "Safrinovskaya 43", 89365773667L, "gazma@mail.ru");
                gazMash.display();

                contract.setWork();
              contract.setEmployee();
            }

    }





