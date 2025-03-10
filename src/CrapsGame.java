import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        String playAgain = "y";
        while (playAgain.equalsIgnoreCase("y")) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;
            System.out.println("You rolled " + die1 + " and " + die2 + ". Total: " + sum);
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You crapped out, You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural, You win!");
            } else {
                System.out.println("Your point is " + sum);
                int point = sum;
                while (true) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("You rolled " + die1 + " and " + die2 + ". Total: " + sum);
                    if (sum == 7) {
                        System.out.println("You lose.");
                        break;
                    }
                    if (sum == point) {
                        System.out.println("You win!");
                        break;
                    }
                }
            }
            System.out.print("Play again? (y/n): ");
            playAgain = input.nextLine();
        }
        input.close();
    }
}
