package org.example.Real;

public class AritmeticSum {
    public static int sumNumbers (int start, int end, int increaseBy) {
        int sum = 0;
        int[] data = new int[end];
        data[0] = start;

        if (start == 0 || end == 0 || increaseBy <= 0) return sum = -1;

        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        for (int i = 1; i <= data.length - 1; i ++) {
            data[i] = data[i - 1] + increaseBy;
        }

        for (int number : data) sum += number;
        System.out.println(sum);
        return sum;
    }

    public static void main (String[] args) {
        sumNumbers(1, 4, 1);
        sumNumbers(1, 3, 3);
    }
}
