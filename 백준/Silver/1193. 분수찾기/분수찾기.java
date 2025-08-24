import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int D = 1;
        int T = 0;
        
        while (T + D < X) {
            T += D;
            D++;
        }

        int P = X - T;

        int A, B;
        if (D % 2 == 1) {
            A = D - P + 1;
            B = P;
        } else {
            A = P;
            B = D - P + 1;
        }

        System.out.println(A + "/" + B);
    }
}