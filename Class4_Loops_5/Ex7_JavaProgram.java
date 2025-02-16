import java.util.Random;
import java.util.Scanner;

public class Ex7_JavaProgram {

    public static void guessNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(10) + 1;
        int userGuess;

        do {
            System.out.print("Enter your guess (between 1 and 10): ");
            userGuess = scanner.nextInt();

            if (userGuess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number.");
            }
        } while (userGuess != numberToGuess);

        scanner.close();
    }

    public static void main(String[] args) {
        guessNumber(); 
    }
}
