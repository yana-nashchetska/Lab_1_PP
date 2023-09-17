package Java_Lab_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Task 1: ");
        System.out.println(" Enter the first number: ");
        int n1 = scan.nextInt();

        System.out.println(" Enter the second number: ");
        int n2 = scan.nextInt();

        System.out.println(" Enter the operator: ");
        char operator = scan.next().charAt(0);

        Task1 task1 = new Task1(n1, n2, operator);
        System.out.println(" \n Result is: " );
        task1.calculate();

        System.out.println(" \n Task 2: ");
        final String[] array = {"TUesday", "WEDnesday", "FRIDAY", "sunday","Monday"};

        Task2 task2 = new Task2(array);
        System.out.println(" \n Default array: \n " + Arrays.toString(array));
        System.out.println(" \n Array after the function was called: ");
        task2.Sort(array);

        System.out.println("\n Task 3: ");
        System.out.println("\n Enter your email: \n");

        String emailString = scan.next();
        Task3 task3 = new Task3(emailString);

        System.out.println(" \n Your email is: " + task3.getEmail());
        System.out.println(" \n Is this email valid?: ");
        System.out.println(Task3.isValid(emailString));
    }
}

