import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();

        int M = Math.min(X, Y);
        int N = Math.min(W - X, H - Y);
        System.out.println(Math.min(M, N));
    }
}