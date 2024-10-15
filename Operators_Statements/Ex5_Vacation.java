
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Ex5_Vacation {
    public Ex5_Vacation() {
    }

    public static void main(String[] args) {
        String Option1 = "Mountain";
        String Option2 = "Beach";
        System.out.print("Which type of vacation do you want (Mountain or Beach): ");
        Scanner scanner = new Scanner(System.in);
        String selection = scanner.nextLine();
        if (!selection.equalsIgnoreCase(Option1) && !selection.equalsIgnoreCase(Option2)) {
            System.out.println("There is no information about this type of vacation.");
        } else {
            System.out.print("Enter your budget: ");
            float budget = scanner.nextFloat();
            if (budget < 30.0F) {
                System.out.println("Your budget is too low for a vacation.");
            } else if (budget >= 30.0F && budget < 50.0F) {
                System.out.println("Choose Bulgaria for your vacation.");
            } else {
                System.out.println("Choose another country for your vacation.");
            }

        }
    }
}
