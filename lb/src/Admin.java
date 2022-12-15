class Admin extends NewUser {

    private String address;

    public Admin(String surname, String name, String email, String address, String login, int password) {
        super(surname, name, email, login, password);
        this.address = address;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Address: " + this.address);
    }
}