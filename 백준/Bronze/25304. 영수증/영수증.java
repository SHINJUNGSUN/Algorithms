import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int N = sc.nextInt();

        int M = 0;

        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            M += A * B;
        }

        System.out.println(P == M ? "Yes" : "No");
    }
}