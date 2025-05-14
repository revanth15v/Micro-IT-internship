import java.util.Scanner;
import java.util.Random;

public class RPSGame {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String[] arr = {"rock", "paper", "scissors"};
        int u = 0, c = 0;

        System.out.println("Rock Paper Scissors");
        System.out.println("Enter rock, paper, or scissors. Type exit to quit.");

        while (true) {
            System.out.print("Your move: ");
            String you = s.nextLine().toLowerCase();
            if (you.equals("exit")) break;

            if (!you.equals("rock") && !you.equals("paper") && !you.equals("scissors")) {
                System.out.println("Invalid. Try again.");
                continue;
            }

            String comp = arr[r.nextInt(3)];
            System.out.println("Computer: " + comp);

            if (you.equals(comp)) {
                System.out.println("It's a tie!");
            } else if ((you.equals("rock") && comp.equals("scissors")) ||
                       (you.equals("paper") && comp.equals("rock")) ||
                       (you.equals("scissors") && comp.equals("paper"))) {
                System.out.println("You win!");
                u++;
            } else {
                System.out.println("Computer wins!");
                c++;
            }

            System.out.println("Score - You: " + u + ", Computer: " + c);
        }

        System.out.println("Final Score - You: " + u + ", Computer: " + c);
        s.close();
    }
}