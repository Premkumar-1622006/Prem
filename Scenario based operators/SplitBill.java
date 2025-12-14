import java.util.Scanner;

public class SplitBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total bill amount: ");
        double total = sc.nextDouble();

        double share = total / 3;
        System.out.println("Each friend should pay: " + share);
    }
}
