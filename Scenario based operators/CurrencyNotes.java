import java.util.Scanner;

public class CurrencyNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();

        int notes500 = amount / 500;
        amount %= 500;

        int notes100 = amount / 100;
        amount %= 100;

        int notes50 = amount / 50;
        amount %= 50;

        int notes10 = amount / 10;
        amount %= 10;
        System.out.println("500s: " + notes500);
        System.out.println("100s: " + notes100);
        System.out.println("50s: " + notes50);
        System.out.println("10s: " + notes10);
        System.out.println("Remaining amount: " + amount);
    }
}
