package org.example;

import java.util.HashMap;
import java.util.Map;

public class EvenOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        for (Integer number : countMap.keySet()) System.out.println("key: " + number + " value: " + countMap.get(number));

        for (int mapKey : countMap.keySet()) {
            if (countMap.get(mapKey) % 2 != 0) return mapKey;
        }
        return 0;
    }
}
