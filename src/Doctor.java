class Doctor extends Person {
    private int login;
    private int password;
    public Doctor(String surname, String name, int birthDate, int login, int password) {
        super(surname, name, birthDate);
        this.login = login;
        this.password = password;
    }
    public int getLogin(){
        return login;
    }
    public int getPassword(){
        return password;
    }
}
