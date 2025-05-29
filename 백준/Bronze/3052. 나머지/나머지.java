import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[42];

        while (sc.hasNextInt()) {
            arr[sc.nextInt() % 42]++;
        }

        int ans = 0;
        for (int j : arr) if (j != 0) ans++;

        System.out.println(ans);
    }
}