package Java_Lab_1.Task5;

public class ReceivePoint {
    private String receivePoint;

    public ReceivePoint() {
    }

    public String getReceivePoint() {
        return receivePoint;
    }

    public void setReceivePoint(String receivePoint) {
        this.receivePoint = receivePoint;
    }

     @Override
    public String toString() {
         return
                 " \n receivePoint='" + receivePoint + '\'';
     }
}

