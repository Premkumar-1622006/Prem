import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double amount = sc.nextDouble();
        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20;
        } else if (amount >= 3000) {
            discount = amount * 0.15;
        } else if (amount >= 1000) {
            discount = amount * 0.10;
        }

        double finalAmount = amount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
    }
}
