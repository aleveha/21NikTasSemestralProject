package Uloha_21;

public class DataProcessing {
    public static void rotation(Data data) {
        int[][] array1 = data.getFirstArray();
        int[][] array2 = data.getSecondArray();
        int degree = 0;

        do {
            if (checkMatrix(array1, array2)) {
                data.setDegree(degree);
                return;
            }
            degree += 90;
            Matrix.rotateMatrix(array1);
        } while (degree <= 270);
    }

    public static boolean checkMatrix(int[][] array1, int[][] array2) {
        boolean rotation = true;
        for(int i = 0; i < array1.length; i++) {
            for (int k = 0; k < array1.length; k++) {
                if (array1[i][k] != array2[i][k]) {
                    rotation = false;
                    break;
                }
            }

            if (!rotation) break;
        }
        return rotation;
    }
}
