package org.example;

import java.util.Arrays;

public class ReversedNumber {
    public static int[] reverseThis (int number) {
        String intToString = String.valueOf(number);
        int[] reversed = new int[intToString.length()];

        for (int i = 0; i < intToString.length(); i ++) {
            int newNumber = Character.getNumericValue(intToString.charAt(i));
            reversed[intToString.length() - 1 - i] = newNumber;
        }
        return reversed;
    }

    public static void main (String[] args) {
        int number = 35231;
        System.out.println(Arrays.toString(reverseThis(number)));
    }
}
