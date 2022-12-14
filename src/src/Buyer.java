class Buyer extends User {
    private int buyerId;

    public Buyer(String surname, String firstname, int age, int clientId) {
        super(surname, firstname, age);
        this.buyerId = buyerId;
    }

    public int getBuyerId() {
        return buyerId;
    }
}