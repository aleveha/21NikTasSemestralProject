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
            if (degree == 0) inputData.setDegree(degree);
            else inputData.setDegree(360 - degree);

            if (checkMatrix(rotatingMatrix, comparedMatrix)) return;
            degree += 90;
            rotateMatrix(rotatingMatrix);
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


    /**
     * @param matrix
     */
    public static void rotateMatrix(int[][] matrix) {
        int row = matrix.length;
        //first find the transpose of the matrix
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
