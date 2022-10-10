public class Main {
   public static void main(String[] args) {

      Seller sellerOne = new Seller("Kirill", 5, 79819469333L);

      System.out.println("Name_old: " + sellerOne.getName());
      sellerOne.setName("Boris");
      System.out.println("Name_new: " + sellerOne.getName());

      System.out.println("PhoneNumber_old: " + sellerOne.getPhoneNumber());
      sellerOne.setPhoneNumber(79004004444L);
      System.out.println("PhoneNumber_new: " + sellerOne.getPhoneNumber());

      System.out.println("Rating_old: " + sellerOne.getRating());
      boolean rate5 = sellerOne.getRating() == 5;
      boolean rate4 = sellerOne.getRating() == 4;
      boolean rate3 = sellerOne.getRating() == 3;
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

      sellerOne.setRating(4);
      System.out.println("ratingNew: " + sellerOne.getRating());
      boolean rate5_1 = sellerOne.getRating() == 5;
      boolean rate4_1 = sellerOne.getRating() == 4;
      boolean rate3_1 = sellerOne.getRating() == 3;
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

      Address addressOne = new Address("Saint Petersburg", "Luzhskaya ul.", 16);
      System.out.println("cityName old: " + addressOne.getCityName());
      addressOne.setCityName("Samoded");
      System.out.println("cityName new: " + addressOne.getCityName());
      System.out.println("streetName old: " + addressOne.getStreetName());
      addressOne.setStreetName("Kirova ul.");
      System.out.println("streetName new: " + addressOne.getStreetName());
      System.out.println("House Number old: " + addressOne.getHouseNumber());
      addressOne.setHouseNumber(11);
      System.out.println("House Number new: " + addressOne.getHouseNumber());


      CarName carOne = new CarName("Honda", "Civic", 2003);
      System.out.println("brandName_old: " + carOne.getBrandName());
      carOne.setBrandName("GAZ");
      System.out.println("brandName_new: " + carOne.getBrandName());
      System.out.println("modelName_old: " + carOne.getModelName());
      carOne.setModelName("24 Volga");
      System.out.println("modelName_new: " + carOne.getModelName());
      System.out.println("Year_old: "+ carOne.getYear());
      carOne.setYear(1980);
      System.out.println("Year_new: "+ carOne.getYear());

      Engine engineOne = new Engine("D17A", "50/50 new gasoline", 127);
      System.out.println("Engine name old: " + engineOne.getEngineName());
      engineOne.setEngineName("ZMZ-2401 24D");
      System.out.println("Engine name new: " + engineOne.getEngineName());
      System.out.println("Engine type old: " + engineOne.getEngineType());
      engineOne.setEngineType("old gasoline engine");
      System.out.println("Engine type new: " + engineOne.getEngineType());
      System.out.println("horsepowerNumber_old: " + engineOne.getHorsepowerNumber());
      engineOne.setHorsepowerNumber(95);
      System.out.println("horsepowerNumber_new: " + engineOne.getHorsepowerNumber());

      Transmission transmissionOne = new Transmission("automatic", 4, "FWD");
      System.out.println("Gear type old: " + transmissionOne.getGearType());
      transmissionOne.setGearType("manual");
      System.out.println("Gear type new: " + transmissionOne.getGearsAmount());
      System.out.println("gearsAmount old: " + transmissionOne.getGearsAmount());
      transmissionOne.setGearsAmount(4);
      System.out.println("gearsAmount new: " + transmissionOne.getDriveType());
      System.out.println("gearsAmount old: " + transmissionOne.getDriveType());
      transmissionOne.setDriveType("RWD");
      System.out.println("gearsAmount new: " + transmissionOne.getDriveType());

      Body bodyOne = new Body("sedan", "green", 2);
      System.out.println("Body type old: " + bodyOne.getBodyType());
      bodyOne.setBodyType("big sedan");
      System.out.println("Body type new: " + bodyOne.getBodyType());
      System.out.println("Body Color old: " + bodyOne.getBodyColor());
      bodyOne.setBodyColor("beige");
      System.out.println("Body Color new: " + bodyOne.getBodyColor());
      System.out.println("Body Condition Rating old: " + bodyOne.getBodyConditionRating());
      boolean rateB5 = bodyOne.getBodyConditionRating() == 5;
      boolean rateB4 = bodyOne.getBodyConditionRating() == 4;
      boolean rateB3 = bodyOne.getBodyConditionRating() == 3;
      {
         if (rateB5) {
            System.out.println("Best condition");
         } else if (rateB4) {
            System.out.println("Good condition");
         }else if (rateB3) {
            System.out.println("Normal condition");
         }else{
            System.out.println("Ohh... condition is very bad at all...");
         }
      }

      bodyOne.setBodyConditionRating(4);
      System.out.println("Body Condition Rating new: " + bodyOne.getBodyConditionRating());
      boolean rateB51 = bodyOne.getBodyConditionRating() == 5;
      boolean rateB41 = bodyOne.getBodyConditionRating() == 4;
      boolean rateB31 = bodyOne.getBodyConditionRating() == 3;
      {
         if (rateB51) {
            System.out.println("Best condition");
         } else if (rateB41) {
            System.out.println("Good condition");
         }else if (rateB31) {
            System.out.println("Normal condition");
         }else{
            System.out.println("Ohh... condition is very bad at all...");
         }
      }

      CarRating crOne = new CarRating(4, 3, 2, 3, 5, 4, 3, 3, 2);

      int Rating = crOne.getManageabilityRating() + crOne.getDynamicsRating() + crOne.getComfortRating() + crOne.getReliabilityRating() + crOne.getTransmissionRating() + crOne.getFuelConsumptionRating() + crOne.getDesignRating() + crOne.getTrunkRating() + crOne.getSafetyRating() -1;
      System.out.println("Full Car Rating old: " + Rating);
      boolean crOne_5 = (Rating <= 45) && (Rating >= 40);
      boolean crOne_4 = (Rating <= 39) && (Rating >= 30);
      boolean crOne_3 = (Rating <= 29) && (Rating >= 20);
      boolean crOne_2 = (Rating <= 19) && (Rating >= 10);
      {
         if (crOne_5) {
            System.out.println("Best car");
         } else if (crOne_4) {
            System.out.println("Good car");
         }else if (crOne_3) {
            System.out.println("Normal car");
         }else if (crOne_2){
            System.out.println("Bad car");
         }else{
            System.out.println("Ohhhh... dude, where did you find this? This is trash..");
         }
      }

      crOne.setManageabilityRating(5);
      crOne.setComfortRating(1);
      crOne.setDesignRating(5);
      crOne.setDynamicsRating(5);
      crOne.setReliabilityRating(5);
      crOne.setFuelConsumptionRating(5);
      crOne.setSafetyRating(5);
      crOne.setTrunkRating(5);
      crOne.setTransmissionRating(5);
      int ratingNew = crOne.getManageabilityRating() + crOne.getDynamicsRating() + crOne.getComfortRating() + crOne.getReliabilityRating() + crOne.getTransmissionRating() + crOne.getFuelConsumptionRating() + crOne.getDesignRating() + crOne.getTrunkRating() + crOne.getSafetyRating() -1;
      System.out.println("Full Car Rating new: " + ratingNew);
      boolean crOne_5_1 = (ratingNew <= 45) && (ratingNew >= 40);
      boolean crOne_4_1 = (ratingNew <= 39) && (ratingNew >= 30);
      boolean crOne_3_1 = (ratingNew <= 29) && (ratingNew >= 20);
      boolean crOne_2_1 = (ratingNew <= 19) && (ratingNew >= 10);
      {
         if (crOne_5_1) {
            System.out.println("Best car");
         } else if (crOne_4_1) {
            System.out.println("Good car");
         }else if (crOne_3_1) {
            System.out.println("Normal car");
         }else if (crOne_2_1){
            System.out.println("Bad car");
         }else{
            System.out.println("Ohhhh... dude, where did you find this? This is trash..");
         }
      }

      VinCheck VinCheck = new VinCheck(2,7);

      boolean vcYes = VinCheck.getRoadAccidentsAmount() > 0;

      if(vcYes){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + VinCheck.getOwnersAmount());

      VinCheck.setRoadAccidentsAmount(0);
      VinCheck.setOwnersAmount(1);

      boolean vcYes1 = VinCheck.getRoadAccidentsAmount() > 0;

      if(vcYes1){
         System.out.println("No road accidents");
      }else{
         System.out.println("Road accidents founded");
      }

      System.out.println("Owners amount: " + VinCheck.getOwnersAmount());

      SuspensionBrakes SuspensionBrakes = new SuspensionBrakes("ind sl", "disk", "ind sl", "disk");

      System.out.println("Forward suspension type old: " + SuspensionBrakes.getForwardSuspensionType());
      SuspensionBrakes.setForwardSuspensionType("ind sl");
      System.out.println("Forward suspension type new: " + SuspensionBrakes.getForwardSuspensionType());
      System.out.println("Forward brakes type old: " + SuspensionBrakes.getForwardBrakesType());
      SuspensionBrakes.setForwardBrakesType("disk");
      System.out.println("Forward brakes type new: " + SuspensionBrakes.getForwardBrakesType());
      System.out.println("Rear suspension type old: " + SuspensionBrakes.getRearSuspensionType());
      SuspensionBrakes.setRearSuspensionType("ind spr");
      System.out.println("Rear suspension type new: " + SuspensionBrakes.getRearSuspensionType());
      System.out.println("Rear brakes type old: " +SuspensionBrakes.getRearBrakesType());
      SuspensionBrakes.setRearBrakesType("drum");
      System.out.println("Rear brakes type new: " +SuspensionBrakes.getRearBrakesType());

      Parametrs Parametrs = new Parametrs(441, 50, 1145, 1590);

      System.out.println("trunkRating volume old: " + Parametrs.getTrunkRatingVolume());
      Parametrs.setTrunkRatingVolume(500);
      System.out.println("trunkRating volume new: " + Parametrs.getTrunkRatingVolume());
      System.out.println("Fuel tank old: " + Parametrs.getFuelTankVolume());
      Parametrs.setFuelTankVolume(55);
      System.out.println("Fuel tank new: " + Parametrs.getFuelTankVolume());
      System.out.println("carWeight old: " + Parametrs.getCarWeight());
      Parametrs.setCarWeight(1420);
      System.out.println("carWeight volume new: " + Parametrs.getCarWeight());
      System.out.println("Max carWeight old: " + Parametrs.getMaxCarWeight());
      Parametrs.setMaxCarWeight(1820);
      System.out.println("Max carWeight new: " + Parametrs.getMaxCarWeight());
   }
}