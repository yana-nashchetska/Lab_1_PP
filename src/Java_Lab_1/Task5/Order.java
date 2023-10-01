package Java_Lab_1.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Order {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private int number; // == index in array;
    private Customer customer;
    private Item item; // asotiation;
    private Shipment shipment;
    private DeparturePoint departurePoint;
    private ReceivePoint receivePoint;
    private double totalPrice; // == item price + additional costs for shipment;

    public Order() {
    }

    public void setItem(Item item) {
    }

    public Order(int number, Customer customer, Item item, Shipment shipment, DeparturePoint departurePoint,
                 ReceivePoint receivePoint, double totalPrice) {
        this.number = number;
        this.customer = customer;
        this.item = item;
        this.shipment = shipment;
        this.departurePoint = departurePoint;
        this.receivePoint = receivePoint;
        this.totalPrice = totalPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Item getItem() {
        return item;
    }

    public void setItem() {
        this.item = item;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    public DeparturePoint getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(DeparturePoint departurePoint) {
        this.departurePoint = departurePoint;
    }

    public ReceivePoint getReceivePoint() {
        return receivePoint;
    }

    public void setReceivePoint(ReceivePoint receivePoint) {
        this.receivePoint = receivePoint;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number=" + number +
                ", customer=" + customer +
                ", orderedItem=" + item +
                ", shipment=" + shipment +
                ", departurePoint=" + departurePoint +
                ", receivePoint=" + receivePoint +
                ", totalPrice=" + totalPrice +
                '}';
    }


}
