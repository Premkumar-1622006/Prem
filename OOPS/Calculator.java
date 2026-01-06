import java.util.Scanner;

public class Calculator {
    Scanner sc = new Scanner(System.in );
    int a = sc.nextInt();
    int b = sc.nextInt();

    void add() {
        System.out.println("Addition: " + (a + b));
    }

    void sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator(); // single object
        c.add();
        c.sub();
    }
}
