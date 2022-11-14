package testapp.model;

import testapp.model.address.ArrivalAddress;
import testapp.model.address.DepartureAddress;
import testapp.model.person.Receiver;
import testapp.model.person.Sender;

import java.util.List;

public class Order {

    private Integer number;

    private Receiver receiver;
    private Sender sender;

    private DepartureAddress departureAddress;
    private ArrivalAddress arrivalAddress;

    private List<FreightItem> freights;

    private Double totalWeight;
    private Double totalPrice;

    public Order(Integer number, Receiver receiver, Sender sender, DepartureAddress departureAddress, ArrivalAddress arrivalAddress, List<FreightItem> freights, Double totalWeight, Double totalPrice) {
        this.number = number;
        this.receiver = receiver;
        this.sender = sender;
        this.departureAddress = departureAddress;
        this.arrivalAddress = arrivalAddress;
        this.freights = freights;
        this.totalWeight = totalWeight;
        this.totalPrice = totalPrice;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Order() {
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public DepartureAddress getDepartureAddress() {
        return departureAddress;
    }

    public void setDepartureAddress(DepartureAddress departureAddress) {
        this.departureAddress = departureAddress;
    }

    public ArrivalAddress getArrivalAddress() {
        return arrivalAddress;
    }

    public void setArrivalAddress(ArrivalAddress arrivalAddress) {
        this.arrivalAddress = arrivalAddress;
    }

    public List<FreightItem> getFreights() {
        return freights;
    }

    public void setFreights(List<FreightItem> freights) {
        this.freights = freights;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Double totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
