package Uloha_21;

public class DataProcessing {
    /**
     * @param inputData
     */
    public static void rotation(InputData inputData) {
        int[][] rotatingMatrix = inputData.getFirstMatrix();
        int[][] comparedMatrix = inputData.getSecondMatrix();
        int degree = 0;

        for (int i = 0; i < 4; i++) {
            if (checkMatrix(rotatingMatrix, comparedMatrix)) {
                inputData.setDegree(/*degree == 0 ? degree : 360 -*/ degree);
            }
            degree += 90;
            rotateMatrix(rotatingMatrix);
        }
    }

    /**
     * @param rotatingMatrix
     * @param comparedMatrix
     * @return
     */
    public static boolean checkMatrix(int[][] rotatingMatrix, int[][] comparedMatrix) {
        boolean rotation = true;
        for (int i = 0; i < rotatingMatrix.length; i++) {
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
//        for (int i = 0; i < row; i++) {
//            for (int j = i + 1; j < row; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }

        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         * */

        /*
         * 9 6 3
         * 8 5 2
         * 7 4 1
         * */

        /*
         * 3 6 9
         * 2 5 8
         * 1 4 7
         * */

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (j == row - 1 - i) break;

                int temp = matrix[i][j];
                matrix[i][j] = matrix[row - 1 - j][row - 1 - i];
                matrix[row - 1 - j][row - 1 - i] = temp;
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
