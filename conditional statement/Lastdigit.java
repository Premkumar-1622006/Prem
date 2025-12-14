import java.util.Scanner;

public class Lastdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = Math.abs(num % 10);

        if (lastDigit % 3 == 0)
            System.out.println("Last digit is divisible by 3");
        else
            System.out.println("Last digit is NOT divisible by 3");
    }
}
