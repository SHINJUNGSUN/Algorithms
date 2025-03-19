import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int[] cnt = new int[10001];

            for (int i = 0; i < N; i++) {
                cnt[Integer.parseInt(br.readLine())]++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= 10000; i++) {
                while (cnt[i]-- > 0) {
                    sb.append(i).append('\n');
                }
            }
            System.out.print(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}