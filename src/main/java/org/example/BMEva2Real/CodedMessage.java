package org.example.BMEva2Real;

public class CodedMessage {
    public static int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= n; i++) { // int = 2 porque ya manejamos los casos de longitud 0 y 1 antes
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {
        String message1 = "111";
        String message2 = "12";
        String message3 = "226";

        System.out.println("Número de formas de decodificar '" + message1 + "': " + numDecodings(message1));
        System.out.println("Número de formas de decodificar '" + message2 + "': " + numDecodings(message2));
        System.out.println("Número de formas de decodificar '" + message3 + "': " + numDecodings(message3));
    }
}

