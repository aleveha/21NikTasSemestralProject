package Uloha_21;

public class DataProcessing {
    /**
     * @param inputData
     */
    public static void rotation(InputData inputData) {
        int[][] rotatingMatrix = inputData.getFirstMatrix();
        int[][] comparedMatrix = inputData.getSecondMatrix();
        int degree = 0;

        do {
            inputData.setDegree(degree);
            if (checkMatrix(rotatingMatrix, comparedMatrix)) return;
            degree += 90;
            InputData.rotateMatrix(rotatingMatrix);
        } while (degree <= 270);

        if (degree == 360) inputData.setDegree(400);
    }

    /**
     * @param rotatingMatrix
     * @param comparedMatrix
     * @return
     */
    public static boolean checkMatrix(int[][] rotatingMatrix, int[][] comparedMatrix) {
        boolean rotation = true;
        for(int i = 0; i < rotatingMatrix.length; i++) {
            for (int k = 0; k < rotatingMatrix.length; k++) {
                if (rotatingMatrix[i][k] != comparedMatrix[i][k]) {
                    rotation = false;
                    break;
                }
            }

            if (!rotation) break;
        }
        return rotation;
    }
}
