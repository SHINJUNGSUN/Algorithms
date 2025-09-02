import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();

        int i = 2;
        while (M != 1) {
            if (M % i == 0) {
                System.out.println(i);
                M = M / i;
            } else {
                i += 1;
            }
        }
    }
}