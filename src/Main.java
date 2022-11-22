public class Main {
    public static void main(String[] args)

    {
        String company = "Hm";
        Jur compania = new Jur(company);

        String TipUslug = "prodazha odezhdi";
        Uslugi usluga = new Uslugi(TipUslug);

        String Name = "Spb";
        City gorod = new City(Name);

        Name = "Primorskiy";
        Rajon rajon;
        rajon = new Rajon(Name);

        String dom = "Komendantskaya";
        int Number = 23;
        Dom plane = new Dom(dom,Number);

        int Numberr = 7774563;
        Number phonenumber = new Number (Numberr);

        Spravochnik spravka;
        spravka = new Spravochnik(compania,usluga,gorod,rajon,plane,phonenumber);
        spravka.GetInfo();

    }
}