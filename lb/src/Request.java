 public class Request {
     private String topic;
     private Problem problem;
     private Answer answer;


     public Request(String topic, Problem problem, Answer answer) {
         this.topic = topic;
         this.problem = problem;
         this.answer = answer;

     }
     public Request() {
     }

         public String getTopic () {
             return topic;
         }

         public void setTopic (String topic){
             this.topic = topic;
         }

         public Problem getProblem () {
             return problem;
         }

         public void setProblem (Problem problem){
             this.problem = problem;

         }

         public Answer getAnswer () {
             return answer;
         }

         public void setAnswer (Answer answer){
             this.answer = answer;
         }

     public void display() {
         System.out.println(this.topic + " " + this.problem + " " + this.answer);
     }
 }