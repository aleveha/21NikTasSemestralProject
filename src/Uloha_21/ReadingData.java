package Uloha_21;

import java.util.Scanner;

public class ReadingData {
    private static final Scanner sc = new Scanner(System.in);

    public static void getArraySizeFromUser (Data data) {
        System.out.println("Zadejte rozmer matic: ");
        data.setArraySize(sc.nextInt());
        sc.nextLine();
    }

    public static int[][] getMatrixFromUser (Data data) {
        int arraySize = data.getArraySize();
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
