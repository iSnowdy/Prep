package org.example.BMEva2Test;

public class WordSearch {
    private char[][] grid;
    private int numRows;
    private int numCols;
    private boolean exit;

    public WordSearch(char[][] grid) {
        this.grid = grid;
        this.numRows = grid.length;
        this.numCols = grid[0].length;
    }

    public boolean searchWord(String word) {
        exit = false;
        checkHorizontal(word);
        checkVertical(word);
        checkDiagonal(word);
        return exit;
    }

    private void checkHorizontal(String word) {
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col <= numCols - word.length(); col++) {
                if (checkWord(row, col, 0, 1, word)) {
                    exit = true;
                    return;
                }
            }
        }
    }

    private void checkVertical(String word) {
        for (int col = 0; col < numCols; col++) {
            for (int row = 0; row <= numRows - word.length(); row++) {
                if (checkWord(row, col, 1, 0, word)) {
                    exit = true;
                    return;
                }
            }
        }
    }

    private void checkDiagonal(String word) {
        for (int row = 0; row <= numRows - word.length(); row++) { // Bottom left ---> Top right
            for (int col = 0; col <= numCols - word.length(); col++) {
                if (checkWord(row, col, 1, 1, word)) {
                    exit = true;
                    return;
                }
            }
        }
        for (int row = 0; row <= numRows - word.length(); row++) { // Bottom right --> Top left
            for (int col = numCols - 1; col >= word.length() - 1; col--) {
                if (checkWord(row, col, 1, -1, word)) {
                    exit = true;
                    return;
                }
            }
        }
    }

    private boolean checkWord(int startRow, int startCol, int deltaRow, int deltaCol, String word) {
        // deltas indicate how we move through the array
        for (int k = 0; k < word.length(); k++) {
            int row = startRow + k * deltaRow;
            int col = startCol + k * deltaCol;
            if (grid[row][col] != word.charAt(k)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'A', 'U', 'C', 'I'},
                {'R', 'B', 'O', 'P'},
                {'C', 'N', 'O', 'B'},
                {'O', 'C', 'A', 'S'}
        };

        WordSearch wordSearch = new WordSearch(grid);

        String word1 = "ARCO";
        String word2 = "OCAS";
        String word3 = "BON";
        String word4 = "PISA";
        String word5 = "ABOS";
        String word6 = "POC";
        String word7 = "POS";

        System.out.println("¿La palabra " + word1 + " está en la matriz? " + wordSearch.searchWord(word1));
        System.out.println("¿La palabra " + word2 + " está en la matriz? " + wordSearch.searchWord(word2));
        System.out.println("¿La palabra " + word3 + " está en la matriz? " + wordSearch.searchWord(word3));
        System.out.println("¿La palabra " + word4 + " está en la matriz? " + wordSearch.searchWord(word4));
        System.out.println("¿La palabra " + word5 + " está en la matriz? " + wordSearch.searchWord(word5));
        System.out.println("¿La palabra " + word6 + " está en la matriz? " + wordSearch.searchWord(word6));
        System.out.println("¿La palabra " + word7 + " está en la matriz? " + wordSearch.searchWord(word7));
    }
}
