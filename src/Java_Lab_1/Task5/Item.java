package Java_Lab_1.Task5;

public class Item {
    private double weight;
    private String name;
    private double price;

    public Item() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return
                " \n name='" + name + '\'' +
                        ",\n price=" + price +
                        ",\n weigh=" + weight;
    }
}
