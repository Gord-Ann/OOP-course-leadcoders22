public class Answer extends Problem {
    private String message;
    private String destination;

    public Answer(int requestNumber, String typeOfProblem, String message, String destination) {
        super(requestNumber, typeOfProblem);
        setMessage(message);
        setDestination(destination);
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String newMessage){
        message = newMessage;
    }

    public String getDestination(){
        return destination;
    }
    public void setDestination(String newDestination){
        destination = newDestination;
    }

    public void display() {
        System.out.println("Response to a request: " + getRequestNumber());
        System.out.println("Topic: " + getTypeOfProblem());
        System.out.println("Answer: " + this.message);
        System.out.println("To: " + this.destination);
    }



}
