package org.example;

public class RepeatChar {
    public static String repeatChar(String text) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < text.length(); i ++) {
            newString.append(text.charAt(i)).append(text.charAt(i));
        }
        return newString.toString();
    }

    public static void main (String[] args) {
        String text = "String";
        System.out.println(repeatChar(text));
    }
}
