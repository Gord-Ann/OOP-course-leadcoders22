package ru.pgups.lepeshkina;

public class Delivery {
    private String deliveryMethod;
    private int price;
    private int timeOfDelivery;

    public Delivery(String deliveryMethod, int price, int timeOfDelivery) {
        this.deliveryMethod = deliveryMethod;
        this.price = price;
        this.timeOfDelivery = timeOfDelivery;
    }
    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTimeOfDelivery() {
        return this.timeOfDelivery;
    }

    public void setTimeOfDelivery(int timeOfDelivery) {
        this.timeOfDelivery = timeOfDelivery;
    }
}

