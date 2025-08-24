import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < N; i++) {
            int T = sc.nextInt();
            for (int coin : coins) {
                System.out.print(T / coin + " ");
                T %= coin;
            }
            System.out.println();
        }
    }
}