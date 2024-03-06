package org.example.Methods;

public class InsertMethod {
    public static void insercion(int[] array) {
        int aux, j;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > aux) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        insercion(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}