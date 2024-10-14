public class AgeCheck {
}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int age = scanner.nextInt();

    if (age>16){
        System.out.println("You are eligible");
    } else if (age <= 16){
            System.out.println("You are not eligible");
        }
}
