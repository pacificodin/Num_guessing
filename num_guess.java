
    import java.util.Random;
import java.util.Scanner;
public class num_guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("<-------Welcome to Number guessing GAME!------->");
        System.out.print("Enter the lower bond of num:");
        int lowerBound =scanner.nextInt();
        System.out.print("Enter the upper bond of number:");
        int upperBound = scanner.nextInt();
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean hasGuessedCorrectly = false;
        System.out.println("You've to selected a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guessing number: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess < numberToGuess) {
                System.out.println("You are too low! Please try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("You are too high! Please try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
                hasGuessedCorrectly = true;
            }
        }

        scanner.close();
    }
}


