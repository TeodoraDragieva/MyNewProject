package Class5_Operators_Statements;

import java.util.Scanner;

final class Ex2_WeekDays {

    public static void main(String[] args) {
        System.out.print("Which number of the day of the week you choose: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1 -> System.out.println("The first day of the week is Monday");
            case 2 -> System.out.println("The second day of the week is Tuesday");
            case 3 -> System.out.println("The third day of the week is Wednesday");
            case 4 -> System.out.println("The forth day of the week is T");
        }

        System.out.println("END!!!");
    }
}
