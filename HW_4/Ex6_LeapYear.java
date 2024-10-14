//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

final class Ex6_LeapYear {
    Ex6_LeapYear() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        double yearInput = (double)scanner.nextFloat();
        double a = yearInput % 4.0;
        double b = yearInput % 100.0;
        double c = yearInput % 400.0;
        if ((a != 0.0 || b != 0.0) && c != 0.0) {
            System.out.println("The Year is not Leap!");
        } else {
            System.out.println("The Year is Leap!");
        }

    }
}
