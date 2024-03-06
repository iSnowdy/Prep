package org.example.Methods;

public class SelectMethod {
    public static void seleccion(int[] array) {
        int aux;
        int min;
        for (int i = 0; i < array.length; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            aux = array[i];
            array[i] = array[min];
            array[min] = aux;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        seleccion(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}