 class Request {
    private String topic;
    private String photo;
    private String address;
    private String comment;

    public Request(String topic, String photo, String address, String comment)
    {
        this.topic = topic;
        this.photo = photo;
        this.address = address;
        this.comment = comment;
    }
    public void display() {
        System.out.println("Topic: " + this.topic );
        System.out.println("Photo size: " + this.photo);
        System.out.println("Mark on the map: " + this.address);
        System.out.println("Photo comment: " + this.comment);
    }

}
