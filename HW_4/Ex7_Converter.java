//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Ex7_Converter {
    public Ex7_Converter() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a temperature: ");
        double temperature = (double)scanner.nextFloat();
        scanner.nextLine();
        System.out.println("How do you want it to be converted? Celsius to Fahrenheit / Fahrenheit to Celsius: ");
        String selection = scanner.nextLine();
        double temperatureF;
        if (selection.equals("Celsius to Fahrenheit")) {
            temperatureF = temperature * 9.0 / 5.0 + 32.0;
            System.out.println("The result is: " + temperatureF);
        } else if (selection.equals("Fahrenheit to Celsius")) {
            temperatureF = (temperature - 32.0) * 5.0 / 9.0;
            System.out.println("The result is: " + temperatureF);
        } else {
            System.out.println("Invalid selection.");
        }

    }
}
