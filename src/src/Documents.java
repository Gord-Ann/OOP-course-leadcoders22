public class Documents {


    protected String whoIssued;
    protected int whoIssuedId;
    protected String registrationAddress;

    public Documents(String whoIssued, int whoIssuedId, String registrationAddress){
        this.whoIssued = whoIssued;
        this.whoIssuedId = whoIssuedId;
        this.registrationAddress = registrationAddress;
    }

    public int getWhoIssuedId() {
        return whoIssuedId;
    }

    public String getWhoIssued() {
        return whoIssued;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }

}

