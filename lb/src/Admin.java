class Admin extends Person {

    private String address;
    private String email;

    public Admin(String login, int password, String address, String email) {
        super(login, password);
        this.address = address;
        this.email = email;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Address: " + this.address);
        System.out.println("E-mail: "+ this.email);
    }
}