package ru.pgups.lepeshkina;

public class Shop {
    public  static void main(String[] args){
        System.out.println();
        Box box = new Box("Moskovskiy prospekt 5",90000,100);
        System.out.println(box.getAddress());
        System.out.println(box.getRentalPrice());
        System.out.println(box.getSquare());
        System.out.println();

        Customer customer = new Customer("Petrov Oleg Vladimirivich", "fridge", 55000);
        System.out.println(customer.getFio());
        System.out.println(customer.getProductName());
        System.out.println(customer.getPrice());
        System.out.println();


        Delivery delivery = new Delivery("courier", 2000, 60);
        System.out.println(delivery.getDeliveryMethod());
        System.out.println(delivery.getPrice());
        System.out.println(delivery.getTimeOfDelivery());
        System.out.println();

        Employees employees = new Employees("manager", 5, 45000);
        System.out.println(employees.getJobTitile());
        System.out.println(employees.getExperience());
        System.out.println(employees.getSalary());
        System.out.println();

        Equipment equipment = new Equipment("cashbox", "user-friendly interface", 10);
        System.out.println(equipment.getName());
        System.out.println(equipment.getCharacteristics());
        System.out.println(equipment.getLifetime());
        System.out.println();

        Order order = new Order("fridge", "appliances", 55000);
        System.out.println(order.getName());
        System.out.println(order.getProductType());
        System.out.println(order.getPrice());
        System.out.println();

        Payment payment = new Payment("cart", 2,55000);
        System.out.println(payment.getPaymentType());
        System.out.println(payment.getWaitingTime());
        System.out.println(payment.getOrderPrice());
        System.out.println();

        Product product = new Product("microwave", 5, 9000);
        System.out.println(product.getName());
        System.out.println(product.getExpirationDate());
        System.out.println(product.getPrice());
        System.out.println();

        Provider provider = new Provider("Hardis", "appliances", 5);
        System.out.println(provider.getFirm());
        System.out.println(provider.getTypeOfProduct());
        System.out.println(provider.getAgreementDate());
        System.out.println();
    }
}

