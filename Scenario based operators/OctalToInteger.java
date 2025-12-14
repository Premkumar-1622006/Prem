import java.util.Scanner;

public class OctalToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String oct = sc.nextLine();
        int decimalValue = Integer.parseInt(oct, 8);
        System.out.println("Integer format: " + decimalValue);
    }
}