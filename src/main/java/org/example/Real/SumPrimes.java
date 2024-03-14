package org.example.Real;

public class SumPrimes {
    public static int sumPrimeNumbers (int first, int second) {
        int sum = 0;
        if (first > second) return sum;

        for (int i = first; i <= second; i ++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;
    }

    public static boolean isPrime (int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i ++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        sumPrimeNumbers(3, 7);
        sumPrimeNumbers(2, 7); // 17 primes and 15 odds
        sumPrimeNumbers(7, 3);
        sumPrimeNumbers(4, 8);
    }
}
