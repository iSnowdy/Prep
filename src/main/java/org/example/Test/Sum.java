package org.example.Test;
import java.util.ArrayList;

public class Sum {
    public static boolean sumOfTwo(ArrayList arrayList, int k) {
        int[] numbers = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i ++) {
            numbers[i] = (int) arrayList.get(i);
        }

        // for (int number : numbers) System.out.println(number);

        for (int i = 0; i < numbers.length - 1; i ++) {
            for (int j = 0; j < numbers.length - i - 1; j ++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // for (int number : numbers) System.out.println(number);

        for (int i = 0; i < numbers.length - 1; i ++) {
            for (int j = 0; j < numbers.length; j ++) {
                if (numbers[i] + numbers[j] == k) {
                    System.out.println("Numbers are " + numbers[i] + " and " + numbers[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(8);
        arrayList.add(3);
        arrayList.add(22);
        arrayList.add(15);
        int k = 30;
        System.out.println(sumOfTwo(arrayList, k));
    }
}
