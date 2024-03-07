package org.example.Test;

import java.util.ArrayList;

public class Product {
    public static int productOfTwo (ArrayList arrayList) {
        int result = 0;

        int[] numbers = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i ++) {
            numbers[i] = (int) arrayList.get(i);
        }

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

        if (numbers.length == 3) {
            if (numbers[0] == 0) result = numbers[1] * numbers[2];
            else result = numbers[0] * numbers[1] * numbers[2];
        }

        result = numbers[numbers.length - 1] * numbers[numbers.length - 2] * numbers[numbers.length - 3];

        return result;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(); // 750
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(15);
        arrayList.add(4);

        System.out.println(productOfTwo(arrayList));
    }
}
