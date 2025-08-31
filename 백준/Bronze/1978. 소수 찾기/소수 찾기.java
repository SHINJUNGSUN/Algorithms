import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int primeCount = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            boolean isPrime = false;
            if (num == 2) {
                isPrime = true;
            } else if (num > 2 && num % 2 != 0) {
                isPrime = true;
                int sqrt = (int) Math.sqrt(num);
                for (int j = 3; j <= sqrt; j += 2) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) primeCount++;
        }

        System.out.println(primeCount);
    }
}