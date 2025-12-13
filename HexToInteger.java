import java.util.Scanner;

public class HexToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();
        int decimalValue = Integer.parseInt(hex, 16);
        System.out.println("Integer format: " + decimalValue);
    }
}
