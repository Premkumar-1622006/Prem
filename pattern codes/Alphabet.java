public class Alphabet {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n - 1; j++)
                System.out.print(" ");

            char ch = 'A';
            for (int j = 0; j <= i; j++)
                System.out.print(ch++);

            ch -= 2;
            for (int j = 0; j < i; j++)
                System.out.print(ch--);

            System.out.println();
        }
    }
}
