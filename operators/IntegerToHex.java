import java.util.Scanner;

public class IntegerToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int num = sc.nextInt();
        String hexValue = Integer.toHexString(num);
        System.out.println("Hexadecimal format: " + hexValue.toUpperCase());
    }
}
