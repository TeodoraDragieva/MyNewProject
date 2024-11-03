package Class6_Data_Structure;

public class Ex2_El_from_Matrix {

    public static void main(String[] args) {

        int[][] integer = {
                {12, 13, 14},
                {15, 16, 17},
                {18, 19, 20},
                {21, 22, 23}
        };

        for (int row = 0; row < integer.length; row++) {
            for (int col = 0; col < integer[row].length; col++) {
                System.out.print(integer[row][col] + " ");
            }
            System.out.println();
        }

    }
}


//2. Print elements of a given 2-d matrix with 4 rows and 3 columns