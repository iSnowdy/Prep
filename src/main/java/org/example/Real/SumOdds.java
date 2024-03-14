package org.example.Real;

public class SumOdds {
    public static int sumOddNumbers (int first, int second) {
        int sum = 0;
        if (first > second) return sum;

        for (int i = first; i <= second; i ++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static void main (String[] args) {
        sumOddNumbers(3, 7);
        sumOddNumbers(2, 7);
        sumOddNumbers(4, 8);
    }
}
