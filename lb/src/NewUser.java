public class NewUser extends Person {
    private String login;
    private int password;


    public NewUser(String surname, String name, String email, String login, int password) {
        super(surname, name, email);
        this.login = login;
        this.password = password;
    }


    public void create() {
        System.out.println("Surname: " + getSurname());
        System.out.println("Name: "+ getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Login: " + this.login);
        System.out.println("Password: " + this.password);

    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login){
        this.login = login;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password){
        this.password = password;
    }
}
