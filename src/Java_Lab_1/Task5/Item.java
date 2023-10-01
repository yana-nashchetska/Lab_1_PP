package Java_Lab_1.Task5;

public class Item {
    private double weight;
    private String name;
    private double price;


    public Item(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public Item() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

/*
    public void print() throws IOException {
        System.out.println("Name: " + name + " Price: " + price + " Weight: " + weight);
    }
*/

    @Override
    public String toString() {
        return
                " \n name='" + name + '\'' +
                        ",\n price=" + price +
                        ",\n weigh=" + weight;
    }
}
