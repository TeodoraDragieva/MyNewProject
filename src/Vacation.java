import java.util.Scanner;

public class Vacation {

    public static void main(String[] args) {
        // Defining options for vacation type
        String Option1 = "Mountain";
        String Option2 = "Beach";

        // Asking user for vacation type
        System.out.print("Which type of vacation do you want (Mountain or Beach): ");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();  // Read user input as a string

        // Validate the selection input
        if (!selection.equalsIgnoreCase(Option1) && !selection.equalsIgnoreCase(Option2)) {
            System.out.println("There is no information about this type of vacation.");
            return;  // Exit the program if the selection is invalid
        }

        // Asking user for budget
        System.out.print("Enter your budget: ");
        float budget = scanner.nextFloat();  // Read user input as a float

        // Validate the budget and suggest vacation location
        if (budget < 30) {
            System.out.println("Your budget is too low for a vacation.");
        } else if (budget >= 30 && budget < 50) {
            System.out.println("Choose Bulgaria for your vacation.");
        } else {
            System.out.println("Choose another country for your vacation.");
        }
    }
}
