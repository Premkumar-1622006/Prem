import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        double surfaceArea = 6 * side * side;
        double volume = side * side * side;
        double perimeter = 12 * side; 
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
        System.out.println("Perimeter: " + perimeter);
    }
}
