package Java_Lab_1.Task5;

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

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setItem(Item item) {
        this.item = item;
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

        ReceivePoint receivePoint = new ReceivePoint();
        //receivePoint.getListOfReceivePoints();
        System.out.println("List of receive points: ");
        System.out.println(receivePoint);
        System.out.println("Enter receive point name");
        String receivePointName = scanner.next();
        receivePoint.setReceivePointName(receivePointName);
        order.setReceivePoint(receivePoint);

        DeparturePoint departurePoint = new DeparturePoint();
        System.out.println("Enter departure point");
        departurePoint.setDeparturePoint(scanner.next());

        order.setDeparturePoint(departurePoint);

        Shipment shipment = new Shipment();
        shipment.setTransport(item.getWeight(), order.getReceivePoint(), order.getDeparturePoint());
        shipment.setShipmentTime(shipment.getTransport());

        if (shipment.getTransport().equals("NoTransport")) {
            System.out.println("Order is added with transport 'NoTransport'");
        } else {
            shipment.setShipmentTime(shipment.getTransport());
            order.setShipment(shipment);
            order.totalPrice = order.getTotalPrice();
        }

        order.setShipment(shipment);


        order.totalPrice = order.getTotalPrice();
        return order;
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
            totalPrice = item.getPrice();
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
