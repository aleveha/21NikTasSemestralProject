package Uloha_21;

import java.util.Scanner;

public class DataReader {
    private static final Scanner sc = new Scanner(System.in);

    /**
     * @param inputData
     */
    public static void getArraySizeFromUser (InputData inputData) {
        System.out.println("Zadejte rozmer matic: ");
        inputData.setMatrixSize(sc.nextInt());
        sc.nextLine();
    }

    /**
     * @param inputData
     * @return
     */
    public static int[][] getMatrixFromUser (InputData inputData) {
        int arraySize = inputData.getMatrixSize();
        int[][] array = new int[arraySize][arraySize];
        String[] arrayLine;

        for (int i = 0; i < arraySize; i++) {
            arrayLine = sc.nextLine().split(" ");
            for (int k = 0; k < arrayLine.length; k++) {
                array[i][k] = Integer.parseInt(arrayLine[k]);
            }
        }

        return array;
    }
}
