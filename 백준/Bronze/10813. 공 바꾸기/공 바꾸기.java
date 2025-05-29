import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] B = new int[N];

        for (int i = 0; i < N; i++) B[i] = i + 1;

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            int temp = B[I - 1];

            B[I - 1] = B[J - 1];
            B[J - 1] = temp;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(B[i] + " ");
        }
    }
}