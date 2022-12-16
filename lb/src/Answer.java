public class Answer {
    private String message;
    private String destination;


    public Answer(String message, String destination) {
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


    public void send() {
        System.out.println("Answer: " + this.message);
        System.out.println("To: " + this.destination);
    }



}
