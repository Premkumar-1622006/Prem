import java.util.Scanner;

public class FirstLastEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4-digit year: ");
        int year = sc.nextInt();

        int firstTwo = year / 100;
        int lastTwo = year % 100;

        if (firstTwo == lastTwo) {
            System.out.println("First two and last two digits are equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
