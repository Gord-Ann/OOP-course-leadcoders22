package ru.pgups.lepeshkina;

public class Payment {
    private String paymentType;
    private int waitingTime;
    private int orderPrice;

    public Payment(String paymentType, int waitingTime, int orderPrice) {
        this.paymentType = paymentType;
        this.waitingTime = waitingTime;
        this.orderPrice = orderPrice;
    }


    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getWaitingTime() {
        return waitingTime;
    }

    public void setWaitingTime(int waitingTime) {

        this.waitingTime = waitingTime;
    }



    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }
}
