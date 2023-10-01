package Java_Lab_1.Task5;

public class Shipment {
    private String transport;
    private int shipmentTime;

    public Shipment() {
        this.transport = "NoTransport";
        this.shipmentTime = 0;
    }


    public String getTransport() {
        return transport;
    }

    public void setTransport(double weight, ReceivePoint receivePoint, DeparturePoint departurePoint) {

        boolean checkPoints = comparePoints(receivePoint, departurePoint);
        boolean includeDeparture = doesReceiveIncludesDeparture(receivePoint.getListOfReceivePoints(),
                departurePoint.getDeparturePoint());
        if (!includeDeparture) {
            this.transport = "bicycle courier";
        } else if (!checkPoints) {
            if (weight <= 10) {
                this.transport = "bicycle courier";
            } else if (weight <= 100) {
                this.transport = "truck";
            } else if (weight <= 10_000) {
                this.transport = "plane";
            } else if (weight <= 100_000) {
                this.transport = "train";
            } else {
                System.out.println("Too heavy item!");
                this.transport = "NoTransport";
            }
        } else {
            this.transport = "NoTransport";
        }
    }
    public boolean comparePoints(ReceivePoint receivePoint, DeparturePoint departurePoint) {
        if (receivePoint.getReceivePointName().equals(departurePoint.getDeparturePoint())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean doesReceiveIncludesDeparture(String[] listOfReceivePoints, String departurePoint) {
        for(String receivePoint : listOfReceivePoints) {
            if (receivePoint.equals(departurePoint)) {
                return true;
            }
        }
        return false;
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
                this.shipmentTime = 0;
                break;
        }
    }

    @Override
    public String toString() {
        return
                "transport: '" + transport + '\n' +
                        ", shipmentTime: " + shipmentTime;
    }
}




