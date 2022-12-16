public class Problem {
    private String typeOfProblem;
    private int requestNumber;
    private ProblemMessage problemMessage;


    public Problem(int requestNumber, String typeOfProblem) {
            System.out.println(" ");
            System.out.println("Collecting data about the problem...");
            this.typeOfProblem = typeOfProblem;
            this.requestNumber = requestNumber;
            this.problemMessage = problemMessage;
        }


    public String getTypeOfProblem() {
        return typeOfProblem;
    }

    public void setTypeOfProblem(String typeOfProblem) {
        this.typeOfProblem = typeOfProblem;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public ProblemMessage geProblemMessage() {
        return problemMessage;
    }

    public void setProblemMessage(ProblemMessage problemMessage) {
        this.problemMessage = problemMessage;
    }
    public void display () {

    }
}
