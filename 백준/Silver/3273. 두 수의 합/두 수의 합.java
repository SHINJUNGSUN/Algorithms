import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int X = sc.nextInt();

        boolean[] exist = new boolean[1000001];
        for (int i = 0; i < N; i++)
            exist[arr[i]] = true;

        int ans = 0;
        for (int i = 0; i < N; i++) {
            int pairValue = X - arr[i];
            if (0 <= pairValue && pairValue <= 1000000)
                ans += exist[pairValue] ? 1 : 0;
        }
        System.out.println(ans / 2);
    }
}