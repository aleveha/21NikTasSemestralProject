package Uloha_21;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixTransformation {
    public static void startProgram() {
        InputData inputData = new InputData();

        getData(inputData);
        while (inputData.getMatrixSize() > 0) {
            calculateTransformation(inputData);
            answerMessage(inputData.getDegree());
            getData(inputData);
        }
    }

    /**
     * @param inputData
     */
    private static void getData(InputData inputData) {
        DataReader.getArraySizeFromUser(inputData);

        if (inputData.getMatrixSize() < 1) return;

        newLine();

        System.out.println("Prvni matice:");
        inputData.setFirstMatrix(DataReader.getMatrixFromUser(inputData));
        newLine();

        System.out.println("Druha matice:");
        inputData.setSecondMatrix(DataReader.getMatrixFromUser(inputData));
        newLine();
    }

    /**
     * @param inputData
     */
    private static void calculateTransformation(InputData inputData) {
        DataProcessing.rotation(inputData);
    }

    /**
     * @param degree
     */
    private static void answerMessage(ArrayList<Integer> degree) {
        if (degree.isEmpty()) {
            System.out.println("Neni rotace");
        } else {
            Collections.sort(degree);
            System.out.print("Rotace ");
            for (int dgr : degree) {
                System.out.print(dgr + " ");
            }
            System.out.println();
        }
        degree.clear();
    }

    private static void newLine() {
        System.out.println();
    }
}
