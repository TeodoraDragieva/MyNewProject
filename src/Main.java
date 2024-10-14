import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Taking input from the user for the three angles
            System.out.print("Enter the first angle: ");
            int angle1 = scanner.nextInt();
            System.out.print("Enter the second angle: ");
            int angle2 = scanner.nextInt();
            System.out.print("Enter the third angle: ");
            int angle3 = scanner.nextInt();

            // Check if the triangle can be built
            if ((angle1 + angle2 + angle3 == 180) && (angle1 > 0 && angle2 > 0 && angle3 > 0)) {
                System.out.println("The triangle can be built.");
                determineTriangleType(angle1, angle2, angle3);
            } else {
                System.out.println("The triangle can't be built based on the angle values.");
            }
        }


        // Function to determine the type of triangle
        public static void determineTriangleType(int angle1, int angle2, int angle3) {
            // Check if the triangle is equilateral
            if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
                System.out.println("The triangle is equilateral (равностранен).");
            }
            // Check if the triangle is isosceles
            else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("The triangle is isosceles (равнобедрен).");
            }
            // Check if the triangle is right-angled
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("The triangle is right-angled (правоъгълен).");
            }
            // Check if the triangle is obtuse
            else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("The triangle is obtuse (тъпоъгълен).");
            }
            // If none of the angles is greater than or equal to 90 degrees, it is acute
            else {
                System.out.println("The triangle is acute (остроъгълен).");
            }

            // If it is neither equilateral nor isosceles, it is scalene
            if (angle1 != angle2 && angle2 != angle3 && angle1 != angle3) {
                System.out.println("The triangle is scalene (разностранен).");
            }
        }
    }
