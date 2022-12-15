 class WebSite {
     public static void main(String args[]) {

         NewUser viktoria = new NewUser("Lepeshkina", "Vikroria", "vv77@mail.ru", "Viktoria77", 123123);
         System.out.println("New User");
         viktoria.create();

         User user= new User("Lepeshkina","Viktoria" , "vv77@mail.ru", "Viktoria77", 123123, 1);
         System.out.println("");
         System.out.println("Registered user");
         user.create();

         Admin cityAdministration = new Admin("Petrov", "Bladimir", "cityadmin@mail.ru", "Nevsky Avenue 7", "cityAdministration",147147);
         System.out.println("");
         System.out.println("City administration");
         cityAdministration.create();


         ProblemMessage ecologicalProblem = new ProblemMessage( "Ecological problem", "3024x4032", "Moskovsky Avenue 7","A lot of garbage. Pay attention to this issue");
         System.out.println("");
         System.out.println("Problem message");
         ecologicalProblem.display();

         Answer answer = new Answer(1, "Ecological problem", "Thank you for the referral. We will try to resolve this issue as soon as possible", "Viktoria77");
         System.out.println("");
         answer.send();




     }
 }