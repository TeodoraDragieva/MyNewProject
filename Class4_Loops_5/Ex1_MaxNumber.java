package Class4_Loops_5;

public class Ex1_MaxNumber {
    public static void main(String[] args){
        int[] numbers = {10, 24, 56, 78, 99, 3, 5, 12, 60};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}

// Find the largest number from a given array and print it in a console.