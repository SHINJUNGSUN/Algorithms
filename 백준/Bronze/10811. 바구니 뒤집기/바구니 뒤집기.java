import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) arr[i] = i + 1;

        for (int i = 0; i < M; i++) {
            int I = sc.nextInt();
            int J = sc.nextInt();
            reverse(arr, I, J);
        }

        for (int i : arr) System.out.print(i + " ");
    }

    public static void reverse(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = arr[i - 1];
            arr[i - 1] = arr[j - 1];
            arr[j- 1] = temp;
        }
    }
}