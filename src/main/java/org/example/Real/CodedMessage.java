package org.example.Real;

public class CodedMessage {
    public static int deCode (String message) {
        int[] arrayCounter = new int[message.length() + 1];
        arrayCounter[0] = 1;
        if (message.length() >= 2) arrayCounter[1] = 2;

        for (int i = 2; i <= message.length(); i ++) {
            int firstDigit = Integer.parseInt(message.substring(i - 1, i));
            int secDigit = Integer.parseInt(message.substring(i - 2, i));
            if (1 <= firstDigit && firstDigit <= 9) {
                arrayCounter[i] = arrayCounter[i - 1] + 1;
            }
            if (10 <= secDigit && secDigit <= 26) {
                arrayCounter[i] = arrayCounter[i - 2] + 1;
            }
        }

        // for (int number : arrayCounter) System.out.println(number);

        System.out.println(arrayCounter[arrayCounter.length - 1]);
        return arrayCounter[arrayCounter.length - 1];
    }

    public static void main (String[] args) {
        deCode("111");
    }
}
