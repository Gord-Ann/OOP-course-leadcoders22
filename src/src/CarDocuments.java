class CarDocuments extends Documents {

    private int serialNumber;
    private int number;

    public CarDocuments (String whoIssued, int whoIssuedId, String registrationAddress, int serialNumber, int number){
        super(whoIssued, whoIssuedId, registrationAddress);
        this.serialNumber = serialNumber;
        this.number = number;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getNumber() {
        return number;
    }
}
