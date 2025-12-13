import java.util.Scanner;

public class PrintMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of Subject 1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter marks of Subject 2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter marks of Subject 3: ");
        int s3 = sc.nextInt();

        System.out.println("Marks entered:");
        System.out.println("Subject 1: " + s1);
        System.out.println("Subject 2: " + s2);
        System.out.println("Subject 3: " + s3);
    }
}