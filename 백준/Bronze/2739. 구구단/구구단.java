import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < 9; i++) {
            System.out.printf("%d * %d = %d", N, i + 1, N * (i + 1));
            System.out.println();
        }
    }
}