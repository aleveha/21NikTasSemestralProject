import Uloha_21.MatrixTransformation;
import VanocniUloha.ChristmasHomework;

import java.util.Scanner;

public class menuUI {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String answer;
        do {
            startMessage();
            answer = answerReader();
            programChoice(answer);
        } while (answer.equals("s") || answer.equals("v"));
    }

    public static void startMessage() {
        System.out.print("Pro spusteni semestralni praci stisknete 'S', pro spusteni vanocni ulohy - 'V', pro ukonceni programu 'K': ");
    }

    public static String answerReader() {
        String answer = sc.next().toLowerCase();
        System.out.println();
        return answer;
    }

    public static void programChoice(String answer) {
        if (answer.equals("s")) {
            MatrixTransformation.startProgram();
            System.out.println();
        } else if (answer.equals("v")) {
            ChristmasHomework.startProgram();
            while(ChristmasHomework.isRunning) {
                try {
                    Thread.sleep(1);
                } catch (Exception ignored) {}
            }
            System.out.println();
        }
    }
}
