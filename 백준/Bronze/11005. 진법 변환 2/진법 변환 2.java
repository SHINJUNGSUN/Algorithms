import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder ans = new StringBuilder();
        
        while (N > 0) {
            int D = N % B;
            if (D < 10) ans.append(D);
            else ans.append((char) (D - 10 + 'A'));
            N = N / B;
        }

        for (int i = ans.length() - 1; i >= 0; i--) {
            System.out.print(ans.charAt(i));
        }
    }
}