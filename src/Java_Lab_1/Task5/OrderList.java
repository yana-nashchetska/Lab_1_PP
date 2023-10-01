package Java_Lab_1.Task5;

import java.util.Arrays;

public class OrderList {
    //TODO: avoid magick number in index;
    private Order[] ordersList;

    public Order[] getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(Order[] ordersList) {
        this.ordersList = ordersList;
    }

public static void addOrder(OrderList orderList, Order order) {
        Order[] orders = orderList.getOrdersList();
           for (int i = 0; i < orders.length - 1; i++) {
                if (orders[i] == null) {
                    orders[i] = order;
                    break;
                }
        }
}
    public static void deleteOrder(int numberToDelete, OrderList orderList) {
        Order[] orders = orderList.getOrdersList();
        orders[numberToDelete] = null;
        orderList.setOrdersList(orders);
    }

    public static void showAllOrders(OrderList orderList) {
        Order[] orders = orderList.getOrdersList();
        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "orders=" + Arrays.toString(ordersList) +
                '}';
    }
}
