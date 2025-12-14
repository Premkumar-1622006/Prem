
import java.util.Scanner;

public class IntegerToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String octalValue = Integer.toOctalString(num);
        System.out.println("Octal format: " + octalValue);
    }
}