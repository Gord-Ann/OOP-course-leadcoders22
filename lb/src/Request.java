 public class Request {
     private String topic;
     private ProblemMessage problemMessage;
     private Answer answer;


     public Request(String topic) {
         this.topic = topic;
         this.problemMessage = problemMessage;
         this.answer = answer;

     }

     public String getTopic() {
         return topic;
     }

     public void setTopic(String topic) {
         this.topic = topic;
     }

     public Problem getProblemMessage() {
         return problemMessage;
     }

     public void setProblemMessage(ProblemMessage problemMessage) {
         this.problemMessage = problemMessage;

     }

     public Answer getAnswer() {
         return answer;
     }

     public void setAnswer(Answer answer) {
         this.answer = answer;
     }
 }