class UnregisteredUser extends Person {
    private String surname;
    private String name;
    private String email;
    private User user;


    public UnregisteredUser(String surname, String name, String email, String login, int password) {
        super(login, password);
        this.surname = surname;
        this.name = name;
        this.email  = email;
    }
    public  User getUser() {return user;}
    public void setUser (User user) {this.user = user;}
    @Override
    public void display() {
        super.display();
        System.out.println("Surname: " + this.surname);
        System.out.println("Name" + this.name);
        System.out.println("Email: " + this.email);

    }
}