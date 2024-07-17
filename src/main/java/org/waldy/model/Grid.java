package org.waldy.model;

public class Grid {
    private char[][] matrix;
    private int size;

    public Grid(int size) {
        this.size = size;
        this.matrix = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = '_';
            }
        }
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }

    public int getSize() {
        return size;
    }
}
