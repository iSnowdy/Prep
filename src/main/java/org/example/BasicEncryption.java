package org.example;

public class BasicEncryption {
    public String encrypt (String text, int rule) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i ++) {
            int charToASCII = text.charAt(i);
            charToASCII = charToASCII + rule;

            charToASCII = charToASCII > 255 ? charToASCII = ((charToASCII - 256) & 0xFF) : charToASCII;
            char convertedBackToLetter = (char) charToASCII;
            result.append(convertedBackToLetter);
        }
        System.out.println(result);
        return result.toString();
    }
}
