package org.example.BMEva2Real;

import java.util.ArrayList;
import java.util.List;

public class orderArray {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }

        int inicioFila = 0, finFila = matrix.length - 1;
        int inicioColumna = 0, finColumna = matrix[0].length - 1;

        while (inicioFila <= finFila && inicioColumna <= finColumna) {
            // Imprimir la fila superior
            for (int col = inicioColumna; col <= finColumna; col++) {
                result.add(matrix[inicioFila][col]);
            }
            inicioFila++;

            // Imprimir la columna derecha
            for (int fila = inicioFila; fila <= finFila; fila++) {
                result.add(matrix[fila][finColumna]);
            }
            finColumna--;

            // Imprimir la fila inferior (si es diferente a la fila superior)
            if (inicioFila <= finFila) {
                for (int col = finColumna; col >= inicioColumna; col--) {
                    result.add(matrix[finFila][col]);
                }
                finFila--;
            }

            // Imprimir la columna izquierda (si es diferente a la columna derecha)
            if (inicioColumna <= finColumna) {
                for (int fila = finFila; fila >= inicioFila; fila--) {
                    result.add(matrix[fila][inicioColumna]);
                }
                inicioColumna++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}
        };

        List<Integer> spiralOrder = spiralOrder(matrix);
        System.out.println("Spiral Order: " + spiralOrder);
    }
}
