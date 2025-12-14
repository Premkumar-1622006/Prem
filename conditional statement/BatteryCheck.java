import java.util.Scanner;

public class BatteryCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter battery percentage: ");
        int battery = sc.nextInt();

        if (battery < 20) {
            System.out.println("Low Battery");
        } else if (battery <= 50) {
            System.out.println("50% Consumed");
        } else {
            System.out.println("Battery Full");
        }
    }
}
