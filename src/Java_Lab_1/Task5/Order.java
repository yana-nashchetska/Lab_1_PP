package Java_Lab_1.Task5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Order {
    private Customer customer;
    private Item item;
    private Shipment shipment;
    private DeparturePoint departurePoint;
    private ReceivePoint receivePoint;
    private double totalPrice;

    public Order() {
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

    public void setItem(Item item) {
        this.item = item;
    }

    public Shipment getShipment() {
        return shipment;
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

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public static Order makeOrder() {
        Scanner scanner = new Scanner(System.in);

        Order order = new Order();
        Item item = new Item();

        System.out.println("Enter item's name");
        item.setName(scanner.next());
        System.out.println("Enter item's weight");
        item.setWeight(scanner.nextDouble());
        System.out.println("Enter item's price");
        item.setPrice(scanner.nextDouble());

        order.setItem(item);

        Customer customer = new Customer();
        System.out.println("Enter customer's name");
        customer.setName(scanner.next());
        System.out.println("Enter customer's surname");
        customer.setSurname(scanner.next());

        order.setCustomer(customer);

        Shipment shipment = new Shipment();
        shipment.setTransport(item.getWeight());
        shipment.setShipmentTime(shipment.getTransport());

        order.setShipment(shipment);

        //TODO: add DeparturePoint and ReceivePoint

        /*DeparturePoint departurePoint = new DeparturePoint();
        System.out.println("Enter departure point");*/

        return order;
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

        if (shipment.getTransport().equals("bicycle courier")) {
            totalPrice = item.getPrice() + 10;
        } else if (shipment.getTransport().equals("truck")) {
            totalPrice = item.getPrice() + 20;
        } else if (shipment.getTransport().equals("plane")) {
            totalPrice = item.getPrice() + 30;
        } else if (shipment.getTransport().equals("train")) {
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
                ", \n Customer:" + customer +
                ", \n Ordered item:" + item +
                ", \n Shipment:" + shipment +
                ", \n Departure point:" + departurePoint +
                ", \n Receive point:" + receivePoint +
                ", \n Total price:" + totalPrice +
                '}';
    }


}
