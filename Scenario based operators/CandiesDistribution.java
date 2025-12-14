import java.util.Scanner;

public class CandiesDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total candies: ");
        int candies = sc.nextInt();
        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int perPerson = candies / people;
        int remaining = candies % people;

        System.out.println("Each person gets: " + perPerson + " candies");
        System.out.println("Remaining candies: " + remaining);
    }
}
