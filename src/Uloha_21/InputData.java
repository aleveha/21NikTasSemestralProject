package Uloha_21;

public class InputData {
    private int matrixSize;
    private int[][] firstMatrix;
    private int[][] secondMatrix;
    private int degree;

    public int getMatrixSize() {
        return matrixSize;
    }
    public void setMatrixSize(int arraySize) {
        this.matrixSize = arraySize;
    }

    public int[][] getFirstMatrix() {
        return firstMatrix;
    }
    public void setFirstMatrix(int[][] firstArray) {
        this.firstMatrix = firstArray;
    }

    public int[][] getSecondMatrix() {
        return secondMatrix;
    }
    public void setSecondMatrix(int[][] secondArray) {
        this.secondMatrix = secondArray;
    }

    public int getDegree() {
        return degree;
    }
    public void setDegree(int degree) {
        this.degree = degree;
    }

    public static void rotateMatrix(int[][] matrix) {
        int row = matrix.length;
        //first find the transpose of the matrix.
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //reverse each row
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
    }
}
