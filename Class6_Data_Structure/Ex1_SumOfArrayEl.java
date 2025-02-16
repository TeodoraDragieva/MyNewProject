package Class6_Data_Structure;

import java.util.Arrays;

public class Ex1_SumOfArrayEl {
    public static void main(String[] args) {

        int[] numbers = {12, 15, 20};
        int sumOfElements = 0;

        for (int i = 0; i < numbers.length; i++) {
            sumOfElements += numbers[i]; 
        }
        System.out.println("The Sum of elements is: " + sumOfElements);
    }
}
