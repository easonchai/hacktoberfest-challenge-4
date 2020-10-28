import java.util.Scanner;

public class App {
    static Scanner input = new Scanner(System.in);

    static int secret = 0;
    static int tries = 0;
    static String[] leaderboard = { "Name", "Tries" };

    public static void guess() {
        int answer = -1;

        while (answer != secret) {
            System.out.print("What is the number? ");
            answer = input.nextInt();
            tries += 1;

            /* Bug 1: Commented out brain fart. */
            // if (Math.random() >= 0.7) {
            //     System.out.println("Woops, brain fart.... Can't help you here");
            // } else {
                /* Bug 2: Added if-else condition to check for high and correct guesses. */
                if (answer < secret) {
                    System.out.println("Too low!");
                } else if (answer > secret) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("You got it!");
                    answer = secret;
                }
            // }
        }

        System.out.println("You took " + tries + " tries!\n");

        System.out.print("Enter your name: ");
        /* Bug 3: Unsure how to fix though. */
        String leaderboardName = input.nextLine();
        // Feel free to implement the leaderboard code!
    }

    public static void runGame() {
        System.out.println("=== Guess the number! ===");
        System.out.println("1. Easy (1-10) ");
        System.out.println("2. Intermediate (1-100) ");
        System.out.println("3. God Mode (1-100000000) ");
        System.out.println("4. Exit ");
        System.out.print("Choose difficulty: ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                secret = (int) ((Math.random() * 10) + 1);
                break;
            case 2:
                /* Bug 4: Changed from 110 to 100 to match intermediate difficulty range. */
                secret = (int) ((Math.random() * 100) + 1);
                break;
            case 3:
                secret = (int) ((Math.random() * 100000000) + 1);
                break;
            default:
            /* Bug 5: Allow user to exit program. */
                System.exit(0);
                // System.out.println("Failed to exit!");
        }
        guess();
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            runGame();
        }
    }
}
