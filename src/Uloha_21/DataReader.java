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

        for (int i = 0; i < arraySize; i++) {
            for (int k = 0; k < arraySize; k++) {
                array[i][k] = sc.nextInt();
            }
        }

        return array;
    }
}
