import java.util.Scanner;

public class PrintDOB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day (DD): ");
        int day = sc.nextInt();

        System.out.print("Enter month (MM): ");
        int month = sc.nextInt();

        System.out.print("Enter year (YYYY): ");
        int year = sc.nextInt();

        System.out.println("Date of Birth: " + day + "/" + month + "/" + year);

        sc.close();
    }
}
