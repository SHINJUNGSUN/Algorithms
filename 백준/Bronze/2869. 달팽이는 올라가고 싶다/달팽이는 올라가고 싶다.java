import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int V = sc.nextInt();

        if (A >= V) {
            System.out.println(1);
            return;
        }

        int netProgress = A - B;

        int remainingDistance = V - A;

        int days = (remainingDistance + netProgress - 1) / netProgress + 1;

        System.out.println(days);
    }
}