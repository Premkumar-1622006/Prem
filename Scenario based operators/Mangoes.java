import java.util.Scanner;

public class Mangoes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total mangoes bought: ");
        int total = sc.nextInt();
        System.out.print("Enter price per mango: ");
        double price = sc.nextDouble();

        int payableMangoes = total - (total / 4);
        double totalAmount = payableMangoes * price;

        System.out.println("Total amount to pay: " + totalAmount);
    }
}
