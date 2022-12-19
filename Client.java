class Client extends  Person{
    private int clientId;
    public Client(String surname, String name, int birthDay, int birthMonth, int birthYear, int clientId) {
        super(surname, name, birthDay, birthMonth, birthYear);
        this.clientId = clientId;
    }

    public int getClientId(){
        return clientId;
    }
}
