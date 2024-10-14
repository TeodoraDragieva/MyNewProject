import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input temperature
        System.out.println("Enter a temperature: ");
        double temperature = scanner.nextFloat();

        // Consume the leftover newline character
        scanner.nextLine();  // This fixes the issue of skipping the next input

        // Input for conversion type
        System.out.println("How do you want it to be converted? Celsius to Fahrenheit / Fahrenheit to Celsius: ");
        String selection = scanner.nextLine();

        // Using equals() to compare strings
        if (selection.equals("Celsius to Fahrenheit")) {
            // Fahrenheit to Celsius formula
            double temperatureC = (temperature * 9.0 / 5) + 32;  // Corrected formula
            System.out.println("The result is: " + temperatureC);
        } else if (selection.equals("Fahrenheit to Celsius")) {
            // Celsius to Fahrenheit formula
            double temperatureF = (temperature - 32) * 5.0 / 9;  // Corrected formula
            System.out.println("The result is: " + temperatureF);
        } else {
            System.out.println("Invalid selection.");
        }
    }
}
