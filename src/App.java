import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    static int secret = 0;
    static int tries = 0;

    public static int easy() {
        secret = (int) ((Math.random() * 10) + 1);
        int answer = -1;

        while (answer != secret) {
            System.out.print("What is the number? ");
            answer = input.nextInt();
            tries += 1;
        }
        return tries;
    }

    public static int intermediate() {
        secret = (int) ((Math.random() * 10) + 1);
        int answer = -1;

        while (answer != secret) {
            System.out.print("What is the number? ");
            answer = input.nextInt();
            tries += 1;
        }
        return tries;
    }

    public static int godMode() {
        secret = (int) ((Math.random() * 10) + 1);
        int answer = -1;

        while (answer != secret) {
            System.out.print("What is the number? ");
            answer = input.nextInt();
            tries += 1;
        }
        return tries;
    }

    public static void runGame() {
        System.out.println("=== Guess the number! ===");
        System.out.println("1. Easy (1-10) ");
        System.out.println("2. Intermediate (1-100) ");
        System.out.println("3. God Mode (1-10000000000) ");
        System.out.println("4. Exit ");
        System.out.print("Choose difficulty: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                secret = (int) ((Math.random() * 10) + 1);
                guess();
                break;
            case 2:
                intermediate();
                break;
            case 3:
                godMode();
                break;
            default:
                System.exit(0);
        }
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            runGame();
        }
    }
}
