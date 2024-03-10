package org.example.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static int myBinarySearch (int[] inputArray, int keyNumber) {
        int leftSide = 0;
        int rightSide = inputArray.length - 1;
        // We have established the lower and upper limits of the array

        Arrays.sort(inputArray); // Its supposed to be already sorted, but just in case

        while (leftSide <= rightSide) {

            int midTable = (int) (leftSide + rightSide) / 2;
            if (inputArray[midTable] == keyNumber) return midTable;
            if (inputArray[midTable] > keyNumber) rightSide = midTable - 1;
            if (inputArray[midTable] < keyNumber) leftSide = midTable + 1;
        }
        return -leftSide - 1;
        // If the element is not found, then it will return the position it should be inserted in assuming its sorted
    }

    public static void main (String[] args) {

        int[] inputArray = {5, 6, 2, 10, 15, 21, 29, 69, 1};
        int keyNumber = 1;
        int keyNumberTwo = 99;

        int indexResultOne = myBinarySearch(inputArray, keyNumber);
        int indexResultTwo = myBinarySearch(inputArray, keyNumberTwo);

        if (indexResultOne >= 0) System.out.println("The number " + keyNumber + " is present in the array. Its position is: " + indexResultOne);
        if (indexResultOne < 0) System.out.println("The number " + keyNumber + " is not present in the array. If you want to insert it, it should be in the position: " + indexResultOne);

        if (indexResultTwo >= 0) System.out.println("The number " + keyNumberTwo + " is present in the array. Its position is: " + indexResultTwo);
        if (indexResultTwo < 0) System.out.println("The number " + keyNumberTwo + " is not present in the array. If you want to insert it, it should be in the position: " + (-indexResultTwo - 1));
    }
}
