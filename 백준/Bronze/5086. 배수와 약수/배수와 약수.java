import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if (A == 0 && B == 0) break;

            if(A > B && A % B == 0) {
                System.out.println("multiple");
            } else if (B > A && B % A == 0) {
                System.out.println("factor");
            } else {
                System.out.println("neither");
            }

        }
    }
}