package Java_Lab_1.Task5;

import java.util.Arrays;

public class ReceivePoint {
/*    private String receivePoint;

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
     }*/

    private final String[] listOfReceivePoints = {
            "Kyiv", "Lviv", "Odesa", "Kharkiv",
            "Dnipro", "Zaporizhzhia", "Kherson",
            "Mykolaiv", "Vinnytsia", "Chernivtsi"
    };

    private String receivePointName;

    public ReceivePoint() {
    }

    public void setReceivePointName(String receivePointName) {
        this.receivePointName = receivePointName;
    }

    public String getReceivePointName() {
        return receivePointName;
    }
    public String[] getListOfReceivePoints() {
        return listOfReceivePoints;
    }

    @Override
    public String toString() {
        return "listOfReceivePoints: \n" + Arrays.toString(listOfReceivePoints);
    }
}

