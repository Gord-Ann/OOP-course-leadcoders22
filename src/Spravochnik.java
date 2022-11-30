public class Spravochnik {
    Jur compania;///Юридическое лицо
    Uslugi usluga;
    City gorod;
    Rajon rajon;
    Dom dom;
    Number phonenumber;

    public Spravochnik(Jur compania, Uslugi usluga, City gorod, Rajon rajon, Dom dom, Number phonenumber) {

        this.compania = compania;
        this.usluga = usluga;
        this.gorod = gorod;
        this.rajon = rajon;
        this.dom = dom;
        this.phonenumber = phonenumber;
    }

    public void GetInfo(){

        System.out.println("Naimenovanie");
        System.out.println("================");
        compania.getInfo();
        System.out.println("================");

        System.out.println("Usluga");
        usluga.GetInfo();
        System.out.println("================");

        System.out.println("Gorod name");
        gorod.getInfo();
        System.out.println("================");

        System.out.println("Rajon name");
        rajon.GetInfo();
        System.out.println("================");

        System.out.println("Adres doma");
        dom.GetInfo();
        System.out.println("================");

        System.out.println("Phone number");
        phonenumber.GetInfo();
        System.out.println("================");

    }
}
