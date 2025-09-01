import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        List<Integer> primes = new ArrayList<>();

        for (int i = M; i <= N; i++) {
            boolean isPrime = false;
            if (i >= 2) {
                if (i == 2) {
                    isPrime = true;
                } else if (i % 2 != 0) {
                    isPrime = true;
                    for (int j = 3; j * j <= i; j += 2) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }
            }

            if (isPrime) {
                primes.add(i);
            }
        }

        if (primes.isEmpty()) {
            System.out.println("-1");
        } else {
            int sum = primes.stream().mapToInt(Integer::intValue).sum();
            System.out.println(sum);
            System.out.println(primes.get(0));
        }

        sc.close();
    }
}