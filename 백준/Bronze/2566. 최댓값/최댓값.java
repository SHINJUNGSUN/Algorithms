import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = 0;
        int I = 1;
        int J = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int N = sc.nextInt();
                if (N > M) {
                    M = N;
                    I = i + 1;
                    J = j + 1;
                }
            }
        }

        System.out.println(M);
        System.out.println(I + " " + J);
    }
}