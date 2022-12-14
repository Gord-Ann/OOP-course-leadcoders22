 class WebSite {
     public static void main(String args[]) {

         UnregisteredUser viktoria = new UnregisteredUser("Lepeshkina", "Viktoria", "victory@mail.ru", "Viktoria77", 123123);
         System.out.println("Unregistered user");
         viktoria.display();

         User user= new User("Viktoria77", 123123, 3);
         System.out.println(viktoria.getUser());
         System.out.println("");
         System.out.println("Registered user");
         user.display();

         Admin cityAdministration = new Admin("cityAdministration", 141414, "Nevsky Avenue 5", "admincity@mail.ru");
         System.out.println("");
         System.out.println("City administration");
         cityAdministration.display();


         ProblemMessage ecologicalProblem = new ProblemMessage( "Ecological problem", "3024x4032", "Moskovsky Avenue 7","A lot of garbage. Pay attention to this issue");
         System.out.println("");
         System.out.println("Problem message");
         ecologicalProblem.display();

         Answer answer = new Answer(001, "Ecological problem", "Thank you for the referral. We will try to resolve this issue as soon sa possible" );
         System.out.println(ecologicalProblem.getAnswer());
         System.out.println("");
         System.out.println("Response to a request");
         answer.display();


     }
 }