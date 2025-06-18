import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];
        int M = 0;
        float S = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > M) M = arr[i];
        }

        for (int i = 0; i < N; i++) {
            S += (float) arr[i] / M * 100;
        }

        System.out.println(S / N);
   }
}