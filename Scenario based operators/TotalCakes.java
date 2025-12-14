import java.util.Scanner;

public class TotalCakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of trays: ");
        int trays = sc.nextInt();
        System.out.print("Enter number of cakes per tray: ");
        int cakesPerTray = sc.nextInt();

        int totalCakes = trays * cakesPerTray;
        System.out.println("Total cakes made: " + totalCakes);
    }
}
