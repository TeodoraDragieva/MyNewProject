import java.util.Scanner;

public class Ex2_IterationList {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int num : numbers) {

            if (num > 150) {
                break;
            }

            if (num % 5 == 0) {
                System.out.println("The number is: " + num);
            }
        }
    }
}

// Given a list iterate it and display numbers which are divisible by 5 and if you
//find number greater than 150 stop the loop iteration list1 = [12, 15, 32, 42,
//55, 75, 122, 132, 150, 180, 200]