package Uloha_21;

public class MatrixTransformation {
    public static void startProgram() {
        InputData inputData = new InputData();

        getData(inputData);
        while (inputData.getMatrixSize() > 0) {
            if (isOneDimension(inputData)) {
                answerMessage(360);
            } else {
                calculateTransformation(inputData);
                answerMessage(inputData.getDegree());
            }
            getData(inputData);
        }
    }

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

    private static void calculateTransformation(InputData inputData) {
        DataProcessing.rotation(inputData);
    }

    private static void answerMessage(int degree) {
        System.out.printf("Rotace %s\n\n", degree <= 270 || degree == 360 ? degree : "zadna neni");
    }

    private static boolean isOneDimension (InputData inputData) {
        return inputData.getMatrixSize() == 1 && inputData.getFirstMatrix()[0][0] == inputData.getSecondMatrix()[0][0];
    }

    private static void newLine() {
        System.out.println();
    }
}
