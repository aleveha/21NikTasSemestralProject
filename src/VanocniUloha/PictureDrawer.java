package VanocniUloha;

import Helpers.Colors;

public class PictureDrawer {
    private static final String[] colorsArray = {Colors.RED, Colors.BLUE, Colors.YELLOW, Colors.PURPLE, Colors.CYAN};

    public static void draw(InputData inputData) {
        int treePartLength;
        int width = inputData.getWigth();
        int height = inputData.getHeight();

        for (int i = 0; i < height; i++) {
            treePartLength = 2 * i + 1;

            drawEmptyLine(2 * height - treePartLength + i);
            drawTreePart(treePartLength);
            drawEmptyLine(width - (2 * height - treePartLength + i) - treePartLength );
            System.out.println(Colors.WHITE);
        }
    }

    public static void drawEmptyLine(int length) {
        int randomElem = (int) (Math.random() * length);

        for (int k = 0; k < length; k++) {
            if (k + 1 == randomElem) {
                System.out.print(" " + Colors.WHITE);
            } else if (k == randomElem) {
                drawSnowflake();
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void drawTreePart(int length) {
        String treeElem = "X" + Colors.GREEN;
        String lamp = "#";
        int randomElem = (int) (Math.random() * length);
        int randomColor = (int) (Math.random() * colorsArray.length);

        for (int i = 0; i < length; i++) {
            if (i + 1 == randomElem) {
                System.out.print(treeElem + colorsArray[randomColor]);
            } else if (i == randomElem && i != 0) {
                System.out.print(lamp + Colors.GREEN);
            } else if (i == length - 1) {
                System.out.print(treeElem + Colors.WHITE);
            } else {
                System.out.print(treeElem);
            }
        }
    }

    public static void drawSnowflake() {
        String snowflake = "*";
        System.out.print(snowflake + Colors.GREEN);
    }
}
