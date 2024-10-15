import java.util.Scanner;

final class Ex4_Revenue {
    Ex4_Revenue() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The unit price is: ");
        double unitPrice = (double)scanner.nextFloat();
        System.out.print("Enter quantity: ");
        double quantity = (double)scanner.nextFloat();
        double discountRate = 0.0;
        if (quantity > 100.0 && quantity < 120.0) {
            discountRate = 15.0;
        } else if (quantity < 100.0) {
            discountRate = 0.0;
        } else if (quantity > 120.0) {
            discountRate = 20.0;
        }

        double discount = discountRate / 100.0 * unitPrice * quantity;
        double revenue = quantity * unitPrice - discount;
        System.out.println("Discount is " + discountRate);
        System.out.println("Revenue is " + revenue);
    }
    }
