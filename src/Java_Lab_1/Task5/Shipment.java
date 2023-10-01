package Java_Lab_1.Task5;

import java.time.LocalDateTime;
import java.util.Date;

public class Shipment {
    private String transport;
    private int shipmentTime;
    public Shipment(String transport) {
        this.transport = transport;
        this.shipmentTime = shipmentTime;
    }

    public Shipment() {
        this.transport = "NoTransport";
        this.shipmentTime = 0;
    }

    public String getTransport() {
        return transport;
    }

    public int getShipmentTime() {
        return shipmentTime;
    }

    public void setTransport(double weight) {
        if (weight <= 10) {
            this.transport = "bicycle courier";
        } else if (weight <= 100) {
            this.transport = "truck";
        } else if (weight <= 10_000) {
            this.transport = "plane";
        } else if (weight <= 100_000) {
            this.transport = "train";
        } else {
            System.out.println("Wrong type of weight!");
        }
    }


        public void setShipmentTime(String transport) {
            switch (transport) {
                case "bicycle courier":
                    this.shipmentTime = 1;
                    break;
                case "truck":
                    this.shipmentTime = 2;
                    break;
                case "plane":
                    this.shipmentTime = 3;
                    break;
                case "train":
                    this.shipmentTime = 4;
                    break;
                default:
                    System.out.println("Wrong type of transport! Try again: \n");
                    setShipmentTime(transport);
            }
        }
    }



