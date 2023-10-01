package Java_Lab_1.Task5;

import java.util.Arrays;

public class OrderList implements OrderListContainer {
    private Order[] listOfOrders;
    private int index;



    public Order[] getListOfOrders() {
        return listOfOrders;
    }

    public void setListOfOrders(Order[] listOfOrders) {
        this.listOfOrders = listOfOrders;
    }

    public OrderList() {
        this.listOfOrders = new Order[10];
    }

    @Override
    public void addOrder(Order order) {
        if (index + 1 == this.listOfOrders.length) {
            extendList();
        }

        this.listOfOrders[index] = order;
        ++index;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

/*    @Override
    public Order[] getOrderDetails(){
        Order[] details = new Order[index + 1];

        for(int i = 0; i < index; i++){
            details[i] = this.order[i];
        }

        return details;
    }*/


    public static void deleteOrder(int numberToDelete, OrderList orderList) {
        Order[] orders = orderList.getListOfOrders();
        orders[numberToDelete - 1] = null;
        orderList.setListOfOrders(orders);
    }

    public void printAllOrders() {
        for (Order order : this.listOfOrders) {
            if (order == null) {
                continue;
            }

            System.out.println(order.toString() + "\n");
        }
    }

    private void extendList() {
        int newListSize = this.listOfOrders.length + 10;

        int newListIndex = 0;
        Order[] newList = new Order[newListSize];

        for (Order order : listOfOrders) {
            newList[newListIndex] = order;
            ++newListIndex;
        }

        this.index = newListIndex;
        this.listOfOrders = newList;
    }

    @Override
    public String toString() {
        return " \n OrderList{ \n" +
                "\n" + Arrays.toString(listOfOrders) +
                '}';
    }
}
