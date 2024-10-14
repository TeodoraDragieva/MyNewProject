
import java.util.Scanner;

public class Ex3_AgeCheck {
}
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


    public static void main(String[] args) {
    System.out.print("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age > 16) {
            System.out.println("You are eligible");
        } else if (age <= 16) {
            System.out.println("You are not eligible");
        }

    }

