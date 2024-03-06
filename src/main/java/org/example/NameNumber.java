package org.example;

public class NameNumber {
    public static String spelledNumber (int number) {
        String result = "";
        String numberToString = String.valueOf(number);

        System.out.println("Number to convert is: " + number);

        String[] zeroToNineTeen = new String[]
                {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] twentyToNinety = new String[]
                {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety"};

        if (number < 20) return result = zeroToNineTeen[number];

        if (number > 20) {
            char firstDigit = numberToString.charAt(0);
            char secondDigit = numberToString.charAt(1);
            int unitControl = Integer.parseInt(String.valueOf(secondDigit));

            if (firstDigit == '2') result = twentyToNinety[2];
            if (firstDigit == '3') result = twentyToNinety[3];
            if (firstDigit == '4') result = twentyToNinety[4];
            if (firstDigit == '5') result = twentyToNinety[5];
            if (firstDigit == '6') result = twentyToNinety[6];
            if (firstDigit == '7') result = twentyToNinety[7];
            if (firstDigit == '8') result = twentyToNinety[8];
            if (firstDigit == '9') result = twentyToNinety[9];

            if (unitControl >= 1 && unitControl < 10) return result = result + " " + zeroToNineTeen[unitControl];
        }
        return result;
    }

    public static void main (String[] args) {
        int number = 99;
        System.out.println(spelledNumber(number));
    }
}
