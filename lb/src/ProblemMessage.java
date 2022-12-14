class ProblemMessage extends Request {

    private Answer answer;

    public ProblemMessage (String topic, String photo, String address, String comment){
        super (topic, photo, address, comment);
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

}
