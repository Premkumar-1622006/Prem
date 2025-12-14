import java.util.Scanner;

public class MiniATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Balance: " + balance);
                break;

            case 2:
                System.out.print("Enter deposit amount: ");
                int dep = sc.nextInt();
                balance += dep;
                System.out.println("Updated Balance: " + balance);
                break;

            case 3:
                System.out.print("Enter withdrawal amount: ");
                int wit = sc.nextInt();
                if (wit <= balance) {
                    balance -= wit;
                    System.out.println("Updated Balance: " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            default:
                System.out.println("Invalid Option");
        }
    }
}
