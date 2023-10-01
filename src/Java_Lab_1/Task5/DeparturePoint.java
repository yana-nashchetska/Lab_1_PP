package Java_Lab_1.Task5;

public class DeparturePoint {
   private String departurePoint;

    public DeparturePoint() {
    }

    public String getDeparturePoint() {
        return departurePoint;
    }

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    @Override
    public String toString() {
        return
                " \n departurePoint='" + departurePoint + '\'';
    }
}
