import java.util.Scanner;

public class PrintDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.println("Roll No: " + roll + ", Name: " + name);

        sc.close();
    }
}
