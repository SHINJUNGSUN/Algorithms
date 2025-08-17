import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] M = new int[100][100];

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            for (int x = A; x < A + 10; x++) {
                for (int y = B; y < B + 10; y++) {
                    M[x][y] = 1;
                }
            }
        }

        int count = 0;

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (M[i][j] == 1) count++;
            }
        }

        System.out.println(count);
    }
}