class ProblemMessage extends Request {
    private String photo;
    private String address;
    private String comment;

    public ProblemMessage(String topic, String photo, String address, String comment) {
        super(topic);
        this.photo = photo;
        this.address = address;
        this.comment = comment;
    }

    public void display()

    {
        System.out.println("Topic: " + getTopic());
        System.out.println("Photo size: " + this.photo);
        System.out.println("Mark on the map: " + this.address);
        System.out.println("Photo comment: " + this.comment);


    }
}
