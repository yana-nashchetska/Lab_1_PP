package Java_Lab_1.Task5;

import java.io.IOException;
import java.util.Scanner;

public class MainTask5 {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);
        OrderList orderList = new OrderList(); //general list of orders. It's like a database;

        System.out.println("\n Hello! What you want to do? \n " +
                "[1] - make an order \n" +
                "[2] - delete an order \n" +
                "[3] - show all orders \n" +
                "[0] - exit");
        int choice = scan.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    Order order1 = OrderInput.makeAnOrder(orderList);
                    OrderList.addOrder(orderList, order1);
                    break;
                case 2:
                    System.out.println("Enter number of order to delete: ");
                    int numberToDelete = scan.nextInt();
                    OrderList.deleteOrder(numberToDelete, orderList);
                    break;
                case 3:
                    OrderList.showAllOrders(orderList);
                    break;
                default:
                    System.out.println("Wrong choice! Try again: \n");
                    break;
            }
            choice = scan.nextInt();
        }
    }
}
