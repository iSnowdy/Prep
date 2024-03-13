package org.example.BMEva2Test;
public class Ecomerce {
    private int[] numbersN;
    private int currentIndex;
    private int size;

    public Ecomerce(int N) {
        numbersN = new int[N];
        currentIndex = 0;
        size = 0;
    }

    public void record(int orderId) {
        numbersN[currentIndex] = orderId;
        currentIndex = (currentIndex + 1) % numbersN.length; // Circular buffer. If it goes out of index, goes back to the start
        if (size < numbersN.length) {
            size++;
        }
    }

    public int getLast(int i) {
        int index = (currentIndex - i + numbersN.length) % numbersN.length;
        return numbersN[index];
    }

    public static void main(String[] args) {
        Ecomerce recorder = new Ecomerce(5);
        recorder.record(101);
        recorder.record(102);
        recorder.record(103);
        recorder.record(104);
        recorder.record(105);

        System.out.println(recorder.getLast(1)); // Output: 105
        System.out.println(recorder.getLast(2)); // Output: 104
        System.out.println(recorder.getLast(3)); // Output: 103
    }
}
