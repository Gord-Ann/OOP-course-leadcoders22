class ProblemMessage extends Problem {
    private String photo;
    private String address;
    private String comment;

    public ProblemMessage(int requestNumber, String typeOfProblem, String photo, String address, String comment) {
        super(requestNumber, typeOfProblem);
        this.photo = photo;
        this.address = address;
        this.comment = comment;
    }

    public void display()

    {
        System.out.println("Topic: " + getTypeOfProblem());
        System.out.println("Request number: " + getRequestNumber());
        System.out.println("Photo size: " + this.photo);
        System.out.println("Mark on the map: " + this.address);
        System.out.println("Photo comment: " + this.comment);


    }
}
