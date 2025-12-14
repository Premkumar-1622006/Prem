import java.util.Scanner;

public class ATMPinCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int storedPin = 1234;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == storedPin) {
            System.out.println("PIN Verified. Access Granted.");
        } else {
            System.out.println("Incorrect PIN. Access Denied.");
        }
    }
}
