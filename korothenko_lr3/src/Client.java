class Client extends Person {
    private int clientId;
    public Client(String surname, String name, int birthDate,int clientId) {
        super(surname, name, birthDate);
        this.clientId = clientId;
    }

    public int getClientId(){
        return clientId;
    }
}
