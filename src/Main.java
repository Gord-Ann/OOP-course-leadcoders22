public class Main {
   public static void main(String[] args) {

      Seller seller_1 = new Seller("Kirill", 5, 79819469333L);

      System.out.println("Name_old: " + seller_1.getName());
      seller_1.setName("Boris");
      System.out.println("Name_new: " + seller_1.getName());

      System.out.println("Rating_old: " + seller_1.getRating());
      boolean rate5 = seller_1.getRating() == 5;
      boolean rate4 = seller_1.getRating() == 4;
      boolean rate3 = seller_1.getRating() == 3;
      {
         if (rate5) {
            System.out.println("The best seller!");
         } else if (rate4) {
            System.out.println("Good seller!");
         }else if (rate3) {
            System.out.println("Not a bad seller.");
         }else{
            System.out.println("Bad seller");
         }
      }

      seller_1.setRating(4);
      System.out.println("Rating_new: " + seller_1.getRating());
      boolean rate5_1 = seller_1.getRating() == 5;
      boolean rate4_1 = seller_1.getRating() == 4;
      boolean rate3_1 = seller_1.getRating() == 3;
      {
         if (rate5_1) {
            System.out.println("The best seller!");
         } else if (rate4_1) {
            System.out.println("Good seller!");
         }else if (rate3_1) {
            System.out.println("Not a bad seller.");
         }else{
            System.out.println("Bad seller");
         }
      }

      Address address_1 = new Address("Saint Petersburg", "Luzhskaya ul.", 16);
      System.out.println("cityName old: " + address_1.getcityName());
      address_1.setcityName("Samoded");
      System.out.println("cityName new: " + address_1.getcityName());
      System.out.println("streetName old: " + address_1.getstreetName());
      address_1.setstreetName("Kirova ul.");
      System.out.println("streetName new: " + address_1.getstreetName());
      System.out.println("House Number old: " + address_1.gethouseNumber());
      address_1.sethouseNumber(11);
      System.out.println("House Number new: " + address_1.gethouseNumber());


      CarName car_1 = new CarName("Honda", "Civic", 2003);
      System.out.println("brandName_old: " + car_1.getbrandName());
      car_1.setbrandName("GAZ");
      System.out.println("brandName_new: " + car_1.getbrandName());
      System.out.println("modelName_old: " + car_1.getmodelName());
      car_1.setmodelName("24 Volga");
      System.out.println("modelName_new: " + car_1.getmodelName());
      System.out.println("Year_old: "+ car_1.getYear());
      car_1.setYear(1980);
      System.out.println("Year_new: "+ car_1.getYear());

      Engine engine_1 = new Engine("D17A", "50/50 new gasoline", 127);
      System.out.println("Engine name old: " + engine_1.getengineName());
      engine_1.setengineName("ZMZ-2401 24D");
      System.out.println("Engine name new: " + engine_1.getengineName());
      System.out.println("Engine type old: " + engine_1.getengineType());
      engine_1.setengineType("old gasoline engine");
      System.out.println("Engine type new: " + engine_1.getengineType());
      System.out.println("horsepowerNumber_old: " + engine_1.gethorsepowerNumber());
      engine_1.sethorsepowerNumber(95);
      System.out.println("horsepowerNumber_new: " + engine_1.gethorsepowerNumber());

      Transmission Transmission_1 = new Transmission("automatic", 4, "FWD");
      System.out.println("Gear type old: " + Transmission_1.getgearType());
      Transmission_1.setgearType("manual");
      System.out.println("Gear type new: " + Transmission_1.getgearsAmount());
      System.out.println("gearsAmount old: " + Transmission_1.getgearsAmount());
      Transmission_1.setgearsAmount(4);
      System.out.println("gearsAmount new: " + Transmission_1.getdriveType());
      System.out.println("gearsAmount old: " + Transmission_1.getdriveType());
      Transmission_1.setdriveType("RWD");
      System.out.println("gearsAmount new: " + Transmission_1.getdriveType());

      Body body_1 = new Body("sedan", "green", 2);
      System.out.println("Body type old: " + body_1.getbodyType());
      body_1.setbodyType("big sedan");
      System.out.println("Body type new: " + body_1.getbodyType());
      System.out.println("Body Color old: " + body_1.getbodyColor());
      body_1.setbodyColor("beige");
      System.out.println("Body Color new: " + body_1.getbodyColor());
      System.out.println("Body Condition Rating old: " + body_1.getbodyconditionRating());
      boolean rateb_5 = body_1.getbodyconditionRating() == 5;
      boolean rateb_4 = body_1.getbodyconditionRating() == 4;
      boolean rateb_3 = body_1.getbodyconditionRating() == 3;
      {
         if (rateb_5) {
            System.out.println("Best condition");
         } else if (rateb_4) {
            System.out.println("Good condition");
         }else if (rateb_3) {
            System.out.println("Normal condition");
         }else{
            System.out.println("Ohh... condition is very bad at all...");
         }
      }

      body_1.setbodyconditionRating(4);
      System.out.println("Body Condition Rating new: " + body_1.getbodyconditionRating());
      boolean rateb_5_1 = body_1.getbodyconditionRating() == 5;
      boolean rateb_4_1 = body_1.getbodyconditionRating() == 4;
      boolean rateb_3_1 = body_1.getbodyconditionRating() == 3;
      {
         if (rateb_5_1) {
            System.out.println("Best condition");
         } else if (rateb_4_1) {
            System.out.println("Good condition");
         }else if (rateb_3_1) {
            System.out.println("Normal condition");
         }else{
            System.out.println("Ohh... condition is very bad at all...");
         }
      }

      CarRating cr_1 = new CarRating(4, 3, 2, 3, 5, 4, 3, 3, 2);

      int Rating = cr_1.getmanageabilityRating() + cr_1.getdynamicsRating() + cr_1.getcomfortRating() + cr_1.getreliabilityRating() + cr_1.gettransmissionRating() + cr_1.getfuelconsumptionRating() + cr_1.getdesignRating() + cr_1.gettrunkRating() + cr_1.getsafetyRating() -1;
      System.out.println("Full Car Rating old: " + Rating);
      boolean cr_1_5 = (Rating <= 45) && (Rating >= 40);
      boolean cr_1_4 = (Rating <= 39) && (Rating >= 30);
      boolean cr_1_3 = (Rating <= 29) && (Rating >= 20);
      boolean cr_1_2 = (Rating <= 19) && (Rating >= 10);
      {
         if (cr_1_5) {
            System.out.println("Best car");
         } else if (cr_1_4) {
            System.out.println("Good car");
         }else if (cr_1_3) {
            System.out.println("Normal car");
         }else if (cr_1_2){
            System.out.println("Bad car");
         }else{
            System.out.println("Ohhhh... dude, where did you find this? This is trash..");
         }
      }

      cr_1.setmanageabilityRating(5);
      cr_1.setcomfortRating(1);
      cr_1.setdesignRating(5);
      cr_1.setdynamicsRating(5);
      cr_1.setreliabilityRating(5);
      cr_1.setfuelconsumptionRating(5);
      cr_1.setsafetyRating(5);
      cr_1.settrunkRating(5);
      cr_1.settransmissionRating(5);
      int Rating_new = cr_1.getmanageabilityRating() + cr_1.getdynamicsRating() + cr_1.getcomfortRating() + cr_1.getreliabilityRating() + cr_1.gettransmissionRating() + cr_1.getfuelconsumptionRating() + cr_1.getdesignRating() + cr_1.gettrunkRating() + cr_1.getsafetyRating() -1;
      System.out.println("Full Car Rating new: " + Rating_new);
      boolean cr_1_5_1 = (Rating_new <= 45) && (Rating_new >= 40);
      boolean cr_1_4_1 = (Rating_new <= 39) && (Rating_new >= 30);
      boolean cr_1_3_1 = (Rating_new <= 29) && (Rating_new >= 20);
      boolean cr_1_2_1 = (Rating_new <= 19) && (Rating_new >= 10);
      {
         if (cr_1_5_1) {
            System.out.println("Best car");
         } else if (cr_1_4_1) {
            System.out.println("Good car");
         }else if (cr_1_3_1) {
            System.out.println("Normal car");
         }else if (cr_1_2_1){
            System.out.println("Bad car");
         }else{
            System.out.println("Ohhhh... dude, where did you find this? This is trash..");
         }
      }

      VinCheck VinCheck = new VinCheck(2,7);

      boolean vc_yes = VinCheck.getroadaccidentsAmount() > 0;

      if(vc_yes){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + VinCheck.getownersAmount());

      VinCheck.setroadaccidentsAmount(0);
      VinCheck.setownersAmount(1);

      boolean vc_yes1 = VinCheck.getroadaccidentsAmount() > 0;

      if(vc_yes1){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + VinCheck.getownersAmount());

      SuspensionBrakes SuspensionBrakes = new SuspensionBrakes("ind sl", "disk", "ind sl", "disk");

      System.out.println("Forward suspension type old: " + SuspensionBrakes.getforwardsuspensionType());
      SuspensionBrakes.setforwardsuspensionType("ind sl");
      System.out.println("Forward suspension type new: " + SuspensionBrakes.getforwardsuspensionType());
      System.out.println("Forward brakes type old: " + SuspensionBrakes.getforwardbrakesType());
      SuspensionBrakes.setforwardbrakesType("disk");
      System.out.println("Forward brakes type new: " + SuspensionBrakes.getforwardbrakesType());
      System.out.println("Rear suspension type old: " + SuspensionBrakes.getrearsuspensionType());
      SuspensionBrakes.setrearsuspensionType("ind spr");
      System.out.println("Rear suspension type new: " + SuspensionBrakes.getrearsuspensionType());
      System.out.println("Rear brakes type old: " +SuspensionBrakes.getrearbrakesType());
      SuspensionBrakes.setrearbrakesType("drum");
      System.out.println("Rear brakes type new: " +SuspensionBrakes.getrearbrakesType());

      Parametrs Parametrs = new Parametrs(441, 50, 1145, 1590);

      System.out.println("trunkRating volume old: " + Parametrs.gettrunkRatingVolume());
      Parametrs.settrunkRatingVolume(500);
      System.out.println("trunkRating volume new: " + Parametrs.gettrunkRatingVolume());
      System.out.println("Fuel tank old: " + Parametrs.getfueltankVolume());
      Parametrs.setfueltankVolume(55);
      System.out.println("Fuel tank new: " + Parametrs.getfueltankVolume());
      System.out.println("carWeight old: " + Parametrs.getcarWeight());
      Parametrs.setcarWeight(1420);
      System.out.println("carWeight volume new: " + Parametrs.getcarWeight());
      System.out.println("Max carWeight old: " + Parametrs.getmaxcarWeight());
      Parametrs.setmaxcarWeight(1820);
      System.out.println("Max carWeight new: " + Parametrs.getmaxcarWeight());
   }
}