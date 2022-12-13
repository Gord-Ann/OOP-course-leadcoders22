package l3;

import java.util.Scanner;

public class Main {

        public static void main (String[]args) {

            Contract contract = new Contract();
            contract.inputNumber();

            Employee alexander = new Employee("Alexander,", "manager,", 89889928393L, "alexCom@yandex.ru");
            alexander.display();
            Contractor gazMash = new GazCompany("Gazmash", "Safrinovskaya 43", 89365773667L, "gazma@mail.ru",1500);
            gazMash.display();

            Work work = new Work("pipe replacement", 50000000);
            work.display();

            Contract contract2 = new Contract();
            contract2.inputNumber();

            Employee dmitry = new Employee("Dmiytry,", "manager,", 898899343493L, "dmgaz@yandex.ru");
            dmitry.display();

            Contractor oilCompany = new OilCompany("OilTree", "Moskovskay 9", 89343433667L, "oilboil@mail.ru",80);
            oilCompany.display();

            Work work2 = new Work("tank repair", 5000000);
            work2.display();
        }
}





