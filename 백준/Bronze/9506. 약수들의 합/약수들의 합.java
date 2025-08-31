import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N;
        while ((N = Integer.parseInt(br.readLine())) != -1) {
            List<Integer> divisors = new ArrayList<>();
            int sum = 0;

            int sqrt = (int) Math.sqrt(N);
            for (int i = 1; i <= sqrt; i++) {
                if (N % i == 0) {
                    if (i < N) {
                        divisors.add(i);
                        sum += i;
                    }

                    int pair = N / i;
                    if (i != pair && pair < N) {
                        divisors.add(pair);
                        sum += pair;
                    }
                }
            }

            divisors.sort(Integer::compareTo);

            if (sum == N) {
                sb.append(N).append(" = ");
                for (int i = 0; i < divisors.size(); i++) {
                    sb.append(divisors.get(i));
                    if (i < divisors.size() - 1) {
                        sb.append(" + ");
                    }
                }
                sb.append("\n");
            } else {
                sb.append(N).append(" is NOT perfect.\n");
            }
        }

        System.out.print(sb);
        br.close();
    }
}