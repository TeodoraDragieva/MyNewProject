import java.util.Scanner;

public class Revenue {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The unit price is: ");
        double unitPrice = scanner.nextFloat();

        System.out.print("Enter quantity: ");
        double quantity = scanner.nextFloat();

        double discountRate = 0;

                if (quantity > 100 && quantity < 120){
                    discountRate = 15;
                }
                else if (quantity < 100) {
                    discountRate = 0;
                } else if (quantity > 120){
                    discountRate = 20;
                    }
                    double discount = (discountRate / 100) * (unitPrice * quantity);
                    double revenue = ((quantity * unitPrice) - discount);

        System.out.println("Discount is " + discountRate);
        System.out.println("Revenue is " + revenue);
        }