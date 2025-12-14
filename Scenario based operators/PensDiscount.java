import java.util.Scanner;

public class PensDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total pens bought: ");
        int total = sc.nextInt();
        System.out.print("Enter price per pen: ");
        double price = sc.nextDouble();

        int payablePens = total - (total / 5 * 2); 
        double totalAmount = payablePens * price;
        System.out.println("Total amount to pay: " + totalAmount);
    }
}
