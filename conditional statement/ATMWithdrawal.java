    import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= balance && amount % 100 == 0) {
            System.out.println("Withdrawal Successful");
        } else {
            System.out.println("Invalid Withdrawal");
        }
    }
}
