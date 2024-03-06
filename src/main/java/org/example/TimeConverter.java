package org.example;

public class TimeConverter {
    public static String makeReadable (int seconds) {
        int hours = seconds / 3600;
        int leftOverSeconds = seconds % 3600;
        int minutes = leftOverSeconds / 60;
        int realSeconds = leftOverSeconds % 60;

        String result = String.format("%02d:%02d:%02d", hours, minutes, realSeconds);

        System.out.println(result);
        return result;
    }
}
