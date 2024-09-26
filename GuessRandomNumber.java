package Questions.Concepts;

import com.mysql.cj.jdbc.exceptions.MySQLStatementCancelledException;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;
        int numberOfGuesses = 0;

        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I have picked a random number between 1 and 100. Can you guess what it is?");

        while (userGuess != randomNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
                System.out.println("It took you " + numberOfGuesses + " tries.");
            }
        }
        scanner.close();
    }
}
