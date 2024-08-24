import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int targetNumber = random.nextInt(10) + 1; // Generates a number between 1 and 10
        int userGuess = 0;
        
        // Display the game rules
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("Game Rules:");
        System.out.println("1. I will randomly pick a number between 1 and 10.");
        System.out.println("2. Your goal is to guess the number.");
        System.out.println("3. After each guess, I will tell you if your guess is too high, too low, or correct.");
        System.out.println("4. Keep guessing until you find the correct number.");
        System.out.println("5. Good luck!");
        System.out.println();
        
        // Start the game
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Can you guess what it is?");
        
        // Game loop
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            if (scanner.hasNextInt()) {
                userGuess = scanner.nextInt();
                
                if (userGuess > targetNumber) {
                    System.out.println("Too high! Try again.");
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Correct! You've guessed the number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 10.");
                scanner.next(); // Consume the invalid input
            }
        }
        
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}