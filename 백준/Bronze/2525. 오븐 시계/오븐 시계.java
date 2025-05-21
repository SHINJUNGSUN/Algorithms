import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int A = sc.nextInt();

        int T = (H * 60 + M + A) % (24 * 60);

        System.out.println(T / 60 + " " + T % 60);
    }
}