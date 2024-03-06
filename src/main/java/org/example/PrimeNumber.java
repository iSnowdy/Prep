package org.example;

public class PrimeNumber {
    public static int solve(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i ++) {
            if (isPrime(i)) counter += arr[i];
        }
        return counter;
    }

    public static boolean isPrime (int number) {
        // Prime is a whole number > 1 that cannot be divided by any other than itself and 1
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i ++) { // Optimizing. Only need to check numbers that are < sqrt(n)
            if (number % i == 0) return false;
        }
        return true;
    }
}
