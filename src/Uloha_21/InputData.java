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
}
