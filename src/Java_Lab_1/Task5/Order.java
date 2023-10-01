package Java_Lab_1.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Order {
    private Customer customer;
    private Item item;
    private Shipment shipment;
    private DeparturePoint departurePoint;
    private ReceivePoint receivePoint;
    private double totalPrice;

    public Order() {
    }

    public Order(int number, Customer customer, Item item, Shipment shipment, DeparturePoint departurePoint,
                 ReceivePoint receivePoint, double totalPrice) {
        this.customer = customer;
        this.item = item;
        this.shipment = shipment;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
        this.totalPrice = totalPrice;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public double getTotalPrice() {

        if(shipment.getTransport().equals("bicycle courier")) {
            totalPrice = item.getPrice() + 10;
        } else if(shipment.getTransport().equals("truck")) {
            totalPrice = item.getPrice() + 20;
        } else if(shipment.getTransport().equals("plane")) {
            totalPrice = item.getPrice() + 30;
        } else if(shipment.getTransport().equals("train")) {
            totalPrice = item.getPrice() + 40;
        } else {
            System.out.println("Wrong type of transport! Try again: \n");
            setShipment(shipment);
        }
        return totalPrice;
    }


    @Override
    public String toString() {
        return "Order{" +
                ", customer=" + customer +
                ", orderedItem=" + item +
                ", shipment=" + shipment +
                ", departurePoint=" + departurePoint +
                ", receivePoint=" + receivePoint +
                ", totalPrice=" + totalPrice +
                '}';
    }


}
