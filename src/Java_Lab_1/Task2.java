package Java_Lab_1;

import java.util.Arrays;

public class Task2 {
    private String[] defaultArray = {};
    public Task2(String[] defaultArray) {
        this.defaultArray = defaultArray;
    }
    public static void Sort(final String[] defaultArray) {
        final int length = defaultArray.length;
        int[] numbers = new int[length];
        String tmp = "";

        for (int i = 0; i < length; i++) {
            int counter = 0;
            char[] word = defaultArray[i].toCharArray();
            for (int j = 0; j < word.length; j++) {
                if (Character.isUpperCase(word[j])) {
                    counter++;
                }
            }
            numbers[i] = counter;
        }

        for (int n = 0; n < length - 1; n++) {
            for (int j = 0; j < length - n - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    tmp = defaultArray[j];
                    defaultArray[j] = defaultArray[j + 1];
                    defaultArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(defaultArray));
    }
}
