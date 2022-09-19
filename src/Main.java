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
      System.out.println("City old: " + address_1.getCity());
      address_1.setCity("Samoded");
      System.out.println("City new: " + address_1.getCity());
      System.out.println("Street old: " + address_1.getStreet());
      address_1.setStreet("Kirova ul.");
      System.out.println("Street new: " + address_1.getStreet());
      System.out.println("House Number old: " + address_1.getHouse_number());
      address_1.setHouse_number(11);
      System.out.println("House Number new: " + address_1.getHouse_number());


      Car_name car_1 = new Car_name("Honda", "Civic", 2003);
      System.out.println("Brand_old: " + car_1.getBrand());
      car_1.setBrand("GAZ");
      System.out.println("Brand_new: " + car_1.getBrand());
      System.out.println("Model_old: " + car_1.getModel());
      car_1.setModel("24 Volga");
      System.out.println("Model_new: " + car_1.getModel());
      System.out.println("Year_old: "+ car_1.getYear());
      car_1.setYear(1980);
      System.out.println("Year_new: "+ car_1.getYear());

      Engine engine_1 = new Engine("D17A", "50/50 new gasoline", 127);
      System.out.println("Engine name old: " + engine_1.getEngine_name());
      engine_1.setEngine_name("ZMZ-2401 24D");
      System.out.println("Engine name new: " + engine_1.getEngine_name());
      System.out.println("Engine type old: " + engine_1.getEngine_type());
      engine_1.setEngine_type("old gasoline engine");
      System.out.println("Engine type new: " + engine_1.getEngine_type());
      System.out.println("Horsepower_old: " + engine_1.getHorsepower());
      engine_1.setHorsepower(95);
      System.out.println("Horsepower_new: " + engine_1.getHorsepower());

      Transmission transmission_1 = new Transmission("automatic", 4, "FWD");
      System.out.println("Gear type old: " + transmission_1.getGear_type());
      transmission_1.setGear_type("manual");
      System.out.println("Gear type new: " + transmission_1.getGears());
      System.out.println("Gears old: " + transmission_1.getGears());
      transmission_1.setGears(4);
      System.out.println("Gears new: " + transmission_1.getDrive_type());
      System.out.println("Gears old: " + transmission_1.getDrive_type());
      transmission_1.setDrive_type("RWD");
      System.out.println("Gears new: " + transmission_1.getDrive_type());

      Body body_1 = new Body("sedan", "green", 2);
      System.out.println("Body type old: " + body_1.getBody_type());
      body_1.setBody_type("big sedan");
      System.out.println("Body type new: " + body_1.getBody_type());
      System.out.println("Body Color old: " + body_1.getBody_color());
      body_1.setBody_color("beige");
      System.out.println("Body Color new: " + body_1.getBody_color());
      System.out.println("Body Condition Rating old: " + body_1.getBody_condition_rating());
      boolean rateb_5 = body_1.getBody_condition_rating() == 5;
      boolean rateb_4 = body_1.getBody_condition_rating() == 4;
      boolean rateb_3 = body_1.getBody_condition_rating() == 3;
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

      body_1.setBody_condition_rating(4);
      System.out.println("Body Condition Rating new: " + body_1.getBody_condition_rating());
      boolean rateb_5_1 = body_1.getBody_condition_rating() == 5;
      boolean rateb_4_1 = body_1.getBody_condition_rating() == 4;
      boolean rateb_3_1 = body_1.getBody_condition_rating() == 3;
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

      int Rating = cr_1.getManageability() + cr_1.getDynamics() + cr_1.getComfort() + cr_1.getReliability() + cr_1.getTransmission() + cr_1.getFuel_consumption() + cr_1.getDesign() + cr_1.getTrunk() + cr_1.getSafety() -1;
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

      cr_1.setManageability(5);
      cr_1.setComfort(1);
      cr_1.setDesign(5);
      cr_1.setDynamics(5);
      cr_1.setReliability(5);
      cr_1.setFuel_consumption(5);
      cr_1.setSafety(5);
      cr_1.setTrunk(5);
      cr_1.setTransmission(5);
      int Rating_new = cr_1.getManageability() + cr_1.getDynamics() + cr_1.getComfort() + cr_1.getReliability() + cr_1.getTransmission() + cr_1.getFuel_consumption() + cr_1.getDesign() + cr_1.getTrunk() + cr_1.getSafety() -1;
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

      VIN_check vin_check = new VIN_check(2,7);

      boolean vc_yes = vin_check.getRoad_accidents_amount() > 0;

      if(vc_yes){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + vin_check.getOwners_amount());

      vin_check.setRoad_accidents_amount(0);
      vin_check.setOwners_amount(1);

      boolean vc_yes1 = vin_check.getRoad_accidents_amount() > 0;

      if(vc_yes1){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + vin_check.getOwners_amount());

      Suspension_and_brakes suspension_and_brakes = new Suspension_and_brakes("ind sl", "disk", "ind sl", "disk");

      System.out.println("Forward suspension type old: " + suspension_and_brakes.getForward_suspension_type());
      suspension_and_brakes.setForward_suspension_type("ind sl");
      System.out.println("Forward suspension type new: " + suspension_and_brakes.getForward_suspension_type());
      System.out.println("Forward brakes type old: " + suspension_and_brakes.getForward_brakes_type());
      suspension_and_brakes.setForward_brakes_type("disk");
      System.out.println("Forward brakes type new: " + suspension_and_brakes.getForward_brakes_type());
      System.out.println("Rear suspension type old: " + suspension_and_brakes.getRear_suspension_type());
      suspension_and_brakes.setRear_suspension_type("ind spr");
      System.out.println("Rear suspension type new: " + suspension_and_brakes.getRear_suspension_type());
      System.out.println("Rear brakes type old: " +suspension_and_brakes.getRear_brakes_type());
      suspension_and_brakes.setRear_brakes_type("drum");
      System.out.println("Rear brakes type new: " +suspension_and_brakes.getRear_brakes_type());

      Volume_and_weight volume_and_weight = new Volume_and_weight(441, 50, 1145, 1590);

      System.out.println("Trunk volume old: " + volume_and_weight.getTrunk_volume());
      volume_and_weight.setTrunk_volume(500);
      System.out.println("Trunk volume new: " + volume_and_weight.getTrunk_volume());
      System.out.println("Fuel tank old: " + volume_and_weight.getFuel_tank());
      volume_and_weight.setFuel_tank(55);
      System.out.println("Fuel tank new: " + volume_and_weight.getFuel_tank());
      System.out.println("Weight old: " + volume_and_weight.getWeight());
      volume_and_weight.setWeight(1420);
      System.out.println("Weight volume new: " + volume_and_weight.getWeight());
      System.out.println("Max weight old: " + volume_and_weight.getMax_weight());
      volume_and_weight.setMax_weight(1820);
      System.out.println("Max weight new: " + volume_and_weight.getMax_weight());





















   }
}