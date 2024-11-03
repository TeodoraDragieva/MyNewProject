
public class Ex4_FirstMultiple {
}

public static void main(String[] args) {

    int[] numbers = {12, 20, 50, 67};

    for (int num : numbers) {

        if (num % 5 == 0) {
            System.out.println("The first number multiple of 5 is " + num);
            break;
        }
    }
}

// Find the first multiple of 5 in an array of numbers.