class Seller extends User {

    private int sellerId;
    public Seller(String surname, String firstname, int age, int sellerId) {
        super(surname, firstname, age);
        this.sellerId = sellerId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void inputUser(){
        System.out.println();
    }
}