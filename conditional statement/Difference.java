import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int diff = Math.abs(a - b);

        if (diff % 2 == 0)
            System.out.println("Difference is Even");
        else
            System.out.println("Difference is Odd");
    }
}
