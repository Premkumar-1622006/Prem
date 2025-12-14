import java.util.Scanner;

public class Travelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter speed (km/h): ");
        double speed = sc.nextDouble();
        System.out.print("Enter time (hours): ");
        double time = sc.nextDouble();

        double distance = speed * time;
        System.out.println("Distance travelled: " + distance + " km");
    }
}
