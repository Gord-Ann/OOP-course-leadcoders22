public class Answer {
    private int requestNumber;
    private String topic;
    private String message;

    public Answer(int requestNumber, String topic, String message) {

        this.requestNumber = requestNumber;
        this.topic = topic;
        this.message = message;
    }
    public void display() {
        System.out.println("Request Number: " + this.requestNumber);
        System.out.println("Topic: " + this.topic);
        System.out.println("Message: " + this.message);
    }
}
