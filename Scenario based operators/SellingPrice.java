import java.util.Scanner;

public class SellingPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter profit: ");
        double profit = sc.nextDouble();

        double sp = cp + profit;
        System.out.println("Selling Price = " + sp);
    }
}
