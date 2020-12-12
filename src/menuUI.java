import java.util.Scanner;

public class menuUI {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        startMessage();
        readingAnswer();
    }

    public static void startMessage() {
        System.out.print("Pro spusteni semestralni praci stisknete 'S', prospusteni vanocni ulohy - 'V': ");
        System.out.println();
    }

    public static void readingAnswer () {
        sc.nextLine();
    }
}
