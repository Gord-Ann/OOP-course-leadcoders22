class Person {

    protected String login;
    protected int password;
    public Person(String login, int password){
        this.login = login;
        this.password = password;
    }

    public void display(){
        System.out.println("Login: " + this.login);
        System.out.println("Password: " + this.password);
    }
}
