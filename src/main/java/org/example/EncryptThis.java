package org.example;

public class EncryptThis {
    public static String encryptThis (String text) {
        if (text.length() == 0) return "";

        StringBuilder outputWord = new StringBuilder();
        String[] textArray = text.split(" ");

        for (String word : textArray) {
            int numberASCII = word.charAt(0);
            outputWord.append(numberASCII);

            if (word.length() > 1) {
                if (word.length() > 2) {
                    String building =   word.charAt(word.length() - 1) +
                                        word.substring(2, word.length() - 1) +
                                        word.charAt(1);
                    outputWord.append(building);
                } else {
                    outputWord.append(word.charAt(1));
                }
            }
            outputWord.append(" ");
        }
        System.out.printf(String.valueOf(outputWord));
        return outputWord.toString().trim();
    }
}
