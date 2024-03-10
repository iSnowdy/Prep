package org.example.Test;

import java.util.HashMap;
import java.util.Locale;

public class CodedSubstring {
    public static int decodeThis(int codedMessage) {
        String message = String.valueOf(codedMessage);

        // Crear un mapa de códigos para asignar letras a números
        HashMap<String, Character> mapCode = new HashMap<>();
        String a = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String text = a.replaceAll(" ", "").toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            mapCode.put(String.valueOf(i + 1), text.charAt(text.length() - 1 - i));
        }

        int[] dp = new int[message.length() + 1];
        dp[0] = 1;
        dp[1] = mapCode.containsKey(message.substring(0, 1)) ? 1 : 0;

        for (int i = 2; i <= message.length(); i++) {
            String oneDigit = message.substring(i - 1, i);
            String twoDigits = message.substring(i - 2, i);
            if (mapCode.containsKey(oneDigit)) {
                dp[i] += dp[i - 1];
            }
            if (mapCode.containsKey(twoDigits)) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[message.length()];
    }

    public static void main(String[] args) {
        int codedMessageOne = 111;
        int codedMessageTwo = 111;
        int codedMessageThree = 52459;

        System.out.println("Mensaje " + codedMessageOne + ": " + decodeThis(codedMessageOne));
        System.out.println("Mensaje " + codedMessageTwo + ": " + decodeThis(codedMessageTwo));
        System.out.println("Mensaje " + codedMessageThree + ": " + decodeThis(codedMessageThree));
    }
}
