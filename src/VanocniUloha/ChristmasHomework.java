package VanocniUloha;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ChristmasHomework {
    public static volatile boolean isRunning = false;

    public static void startProgram() {
        isRunning = true;
        InputData inputData = new InputData();

        getData(inputData);
        calculatePictureSize(inputData);
        setInterval(1000 * 10, 250, inputData);
    }

    public static void getData(InputData inputData) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte sirku obrazku: ");
        inputData.setWigth(sc.nextInt());
        System.out.println();
    }

    public static void calculatePictureSize(InputData inputData) {
        int width = inputData.getWigth();

        if (width % 3 == 1) {
            width += 2;
        } else if (width % 3 == 2) {
            width += 1;
        }

        inputData.setHeight(width / 3);
        inputData.setWigth(width);
    }

    public static void setInterval(int time, int period, InputData inputData) {
        Timer timer = new Timer();
        final long startTime = System.currentTimeMillis();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                drawPicture(inputData);
                long finishTime = System.currentTimeMillis();
                if (finishTime - startTime > time) {
                    timer.cancel();
                    isRunning = false;
                };
            }
        }, 0, period);
    }

    public static void drawPicture(InputData inputData) {
        clearConsole();
        PictureDrawer.draw(inputData);
    }

    public static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
