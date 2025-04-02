import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        String[] numbers = br.readLine().split(" ");
        int[] ans = new int[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(numbers[i]);
            if (num < X) {
                ans[count++] = num;
            }
        }

        for (int num : ans) {
            if (num != 0) bw.write(num + " ");
        }

        bw.newLine();
        bw.flush();
        br.close();
        bw.close();
    }
}