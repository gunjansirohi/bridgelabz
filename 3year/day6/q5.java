package day6;

import java.util.Random;
import java.util.Scanner;

public class q5 {

   
    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getFeedback(Scanner sc, int guess) {
        System.out.print("Is your number " + guess + "? (Enter: high / low / correct): ");
        return sc.nextLine().trim().toLowerCase();
    }

    
    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        int low = 1;
        int high = 100;
        boolean correct = false;

        System.out.println("Think of a number between 1 and 100, and I will try to guess it!");

        while (!correct && low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(sc, guess);

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    System.out.println("Yay! I guessed your number: " + guess);
                    correct = true;
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        if (!correct) {
            System.out.println("Hmm... something went wrong. Did you follow the rules?");
        }
        sc.close();
    }


    public static void main(String[] args) {
        playGame();
    }
}
