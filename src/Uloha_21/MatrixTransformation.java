package Uloha_21;

public class MatrixTransformation {
    public static Data data = new Data();

    public static void startProgram() {
        getDataFromUser(data);
        while (data.getArraySize() > 0) {
            if (data.getArraySize() == 1) {
                answerMessage(360);
            } else {
                calculateTransformation(data);
                answerMessage(data.getDegree());
            }
            getDataFromUser(data);
        }
    }

    private static void getDataFromUser(Data data) {
        ReadingData.getArraySizeFromUser(data);

        if (data.getArraySize() < 1) return;

        newLine();

        System.out.println("Prvni matice:");
        data.setFirstArray(ReadingData.getMatrixFromUser(data));
        newLine();

        System.out.println("Druha matice:");
        data.setSecondArray(ReadingData.getMatrixFromUser(data));
        newLine();
    }

    private static void calculateTransformation(Data data) {
        DataProcessing.rotation(data);
    }

    private static void answerMessage(int degree) {
        System.out.printf("Rotace %d\n", degree);
    }

    private static void newLine() {
        System.out.println();
    }
}
