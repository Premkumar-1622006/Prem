import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original price: ");
        double price = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double finalPrice = price - (price * discount / 100);
        System.out.println("Price after discount: " + finalPrice);
    }
}
