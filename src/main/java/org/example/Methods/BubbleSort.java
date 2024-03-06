package org.example.Methods;

public class BubbleSort {
    public static long maxProduct (int[] numbers, int sub_size) {
        for (int i = 0; i < numbers.length - 1; i ++) {
            for (int j = 0; j < numbers.length - i - 1; j ++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        for (int number : numbers) System.out.println(number);

        long result = 1;
        int n;

        for (int i = 0; i < sub_size; i ++) {
            n = numbers[numbers.length - 1 - i];
            result *= n;
        }
        return result;
    }

    public static void main (String[] args) {
        int[] numbers = {10, 8, 7, 9};
        int sub_size = 3;

        System.out.println(maxProduct(numbers, sub_size));
    }
}
