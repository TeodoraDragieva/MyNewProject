import java.util.Scanner;

public class WeekDays {
}

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int day = scanner.nextInt();
    switch(day){
        case 1:
            System.out.println("Monday");
        break;
        case 2:
            System.out.println("Tuesday");
    }
    System.out.println("END!!!");
}