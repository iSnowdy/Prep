package org.example.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;

public class CodedMessage {
    public static int decodeThis(int codedMessage) {
        int counter = 0;

        HashMap<Character, String> mapCode = new HashMap<>();
        String a = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String text = a.replaceAll(" ", "").toLowerCase(Locale.ROOT);
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            temp.append(text.charAt(text.length() - 1 - i));
        }

        for (int i = 0; i < temp.length(); i++) {
            mapCode.put(temp.charAt(i), String.valueOf(i + 1));
        }

        String codeString = String.valueOf(codedMessage);

        // Buscamos todas las posibles combinaciones de descifrado
        for (int i = 0; i < codeString.length(); i++) {
            for (int j = 1; j <= 2 && i + j <= codeString.length(); j++) {
                // Extraer la subcadena del mensaje codificado
                String subCode = codeString.substring(i, i + j);
                // Verificar si la subcadena está en el mapa de códigos
                if (mapCode.containsValue(subCode)) {
                    // Si la subcadena está en el mapa, incrementar el contador de posibilidades
                    counter++;
                }
            }
        }
        return counter;
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
