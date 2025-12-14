import java.util.Scanner;

public class MinutestoSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        int seconds = minutes * 60;
        System.out.println(minutes + " minutes = " + seconds + " seconds");
    }
}
