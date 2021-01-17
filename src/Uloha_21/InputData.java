package Uloha_21;

import java.util.ArrayList;

public class InputData {
    private int matrixSize;
    private int[][] firstMatrix;
    private int[][] secondMatrix;
    private ArrayList<Integer> degree = new ArrayList<Integer>();

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

    public ArrayList<Integer> getDegree() {
        return degree;
    }
    public void setDegree(int degree) {
        this.degree.add(degree);
    }
}
