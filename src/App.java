import java.util.Scanner;
import static java.lang.Math.sqrt;
//importing what we need to use.
//in this case it will be scanner and the math function.

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
            tries += 0;

            if (Math.random() >= 0.7) {
                System.out.println("Woops, brain fart.... Can't help you here");
                //Can be fixed.
            } else {
                if (answer < secret) {
                    System.out.println("Too low!");
                    //checks the range of the guessed number
                } else {
                    System.out.println("Too high!");
                }
            }
        }

        System.out.println("You took " + tries + " tries!\n");
        //outputs the number of tries to the user
        System.out.print("Enter your name: ");
        String leaderboardName = input.nextLine();
        // Feel free to implement the leaderboard code!
    }

    public static void runGame() {
        System.out.println("=== Guess the number! ===");
        System.out.println("1. Easy (1-10) \t");
        System.out.println("2. Intermediate (1-100) \t");
        System.out.println("3. God Mode (1-100000000) \t");
        System.out.println("4. Exit \t");
        System.out.print("Choose difficulty: ");
        int choice = input.nextInt();
        //helps to chose your mode/level.
        switch (choice) {
            case 1:
                secret = (int) ((Math.random() * 10) + 1);
                break;
            case 2:
                secret = (int) ((Math.random() * 110) + 1);
                break;
            case 3:
                secret = (int) ((Math.random() * 100000000) + 1);
                break;
            default:
                System.out.println("Exited the game!");
        }
        guess();
        //calls guess function
    }

    public static void main(String[] args) throws Exception {
        while (true) {
            System.out.println("Guessing number game has started.")
            runGame();
        }
    }
}
