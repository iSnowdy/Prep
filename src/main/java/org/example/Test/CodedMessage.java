package org.example.arrayCode;

import java.util.*;

public class CodedMessage {
    public static int decodeThis (int codedMessage) {
        int counter = 1;

        HashMap<Character, String> mapCode = new HashMap<>();
        HashSet<Integer> innerCounter = new HashSet<>();
        String a = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String text = a.replaceAll(" ", "").toLowerCase(Locale.ROOT);
        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < text.length(); i ++) {
            temp.append(text.charAt(text.length() - 1 - i));
        }
        for (int i = 0; i < temp.length(); i ++) {
            mapCode.put(temp.charAt(i), String.valueOf(i + 1));
        }

        // for (char i : mapCode.keySet()) System.out.println("key: " + i + " value: " + mapCode.get(i));

        // Code starts here

        String codeString = Integer.toString(codedMessage);
        String[] arrayCode = new String[codeString.length()];
        for (int i = 0; i < codeString.length(); i ++ ) arrayCode[i] = String.valueOf(codeString.charAt(i));
        System.out.println((arrayCode[0] + arrayCode[1]).getClass());

        for (String value : mapCode.values()) {
            if (Objects.equals(arrayCode[0], value)){
                innerCounter.add(1);
                if (Objects.equals(arrayCode[0] + arrayCode[1], value)) {
                    innerCounter.add(2);
                    if (Objects.equals(arrayCode[0] + arrayCode[2], value)) {
                        innerCounter.add(3);
                    }
                }
            }
        }

        for (String value : mapCode.values()) {
            if (Objects.equals(arrayCode[1], value)){
                innerCounter.add(4);
                if (Objects.equals(arrayCode[1] + arrayCode[2], value)) {
                    innerCounter.add(5);
                }
            }
        }

        System.out.println(innerCounter);
        System.out.println(innerCounter.size());



        return counter;
    }

    public static void main (String[] args) {
        int codedMessageOne = 111;
        int codedMessageTwo = 111;
        int codedMessageThree = 52459;

        // System.out.println(decodeThis(codedMessageOne));
        System.out.println(decodeThis(codedMessageTwo));
        // System.out.println(decodeThis(codedMessageThree));
    }
}
