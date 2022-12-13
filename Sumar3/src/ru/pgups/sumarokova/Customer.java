package ru.pgups.sumarokova;

public class Customer extends Person{
    private String bankCard;
    public Customer(String name, String phone, String bankCard){
        super(name, phone);
        this.bankCard=bankCard;
    }
    public Customer() {
    }
    public String getBankCard() {
        return bankCard;
    }
    public void setBankCard(String bankCard) {
        this.bankCard = bankCard;
    }

    @Override
    public void getInfo() {
        System.out.println("name customer: "+ this.name+"\nphone customer: "+this.phone+"\nBank Card customer: "+this.bankCard);
    }

}

