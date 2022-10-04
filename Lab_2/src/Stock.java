public class Stock {
    public static void main(String[] args) {
        System.out.println();
        Boxing boxing = new Boxing("Carton",3*3,365);
        System.out.println(boxing.getMaterial());
        System.out.println(boxing.getSize());
        System.out.println(boxing.getLifetime());
        System.out.println();

        Equipment equipment = new Equipment("Scales",15,50000);
        System.out.println(equipment.getName());
        System.out.println(equipment.getLifetime());
        System.out.println(equipment.getPrice());
        System.out.println();

        Product product = new Product("Table",5,"IKEA");
        System.out.println(product.getName());
        System.out.println(product.getAmount());
        System.out.println(product.getProvider());
        System.out.println();

        Providers providers = new Providers("Leroy Merlin","Laaminate",3);
        System.out.println(providers.getName());
        System.out.println(providers.getProduct());
        System.out.println(providers.getCooperation());
        System.out.println();

        Room room = new Room("Shop 11",100,15000);
        System.out.println(room.getName());
        System.out.println(room.getSquare());
        System.out.println(room.getRent());
        System.out.println();

        Security security = new Security("Fire fighting","Smoke",5);
        System.out.println(security.getName());
        System.out.println(security.getSensors());
        System.out.println(security.getLifetime());
        System.out.println();

        Software software = new Software("Windows",100,11);
        System.out.println(software.getName());
        System.out.println(software.getNumber());
        System.out.println(software.getVersion());
        System.out.println();

        Transport transport = new Transport("CAT","Lonking",300000);
        System.out.println(transport.getName());
        System.out.println(transport.getModel());
        System.out.println(transport.getPrice());
        System.out.println();

        Workers workers = new Workers("Ivanov Ivan Ivanovich","Driver",60000);
        System.out.println(workers.getName());
        System.out.println(workers.getPost());
        System.out.println(workers.getPay());
        System.out.println();
    }
    }
