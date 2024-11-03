
public class Ex5_Skip {
}
public static void main(String[] args) {
    int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

    for (int num : numbers) {
        if (num % 3 != 0) {
            System.out.println("The number is: " + num);
        }
    }
}

//5. Print each number from an array of numbers by skipping numbers that multiples of 3