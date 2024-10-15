import java.util.Scanner;

public class Main{
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = scanner.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = scanner.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = scanner.nextInt();
        if (angle1 + angle2 + angle3 == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("The triangle can be built.");
            determineTriangleType(angle1, angle2, angle3);
        } else {
            System.out.println("The triangle can't be built based on the angle values.");
        }

    }

    public static void determineTriangleType(int angle1, int angle2, int angle3) {
        if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println("The triangle is equilateral.");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            System.out.println("The triangle is isosceles.");
        }

        if (angle1 != 90 && angle2 != 90 && angle3 != 90) {
            if (angle1 <= 90 && angle2 <= 90 && angle3 <= 90) {
                System.out.println("The triangle is acute.");
            } else {
                System.out.println("The triangle is obtuse.");
            }
        } else {
            System.out.println("The triangle is right-angled.");
        }

        if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
            System.out.println("The triangle is scalene.");
        }

    }

