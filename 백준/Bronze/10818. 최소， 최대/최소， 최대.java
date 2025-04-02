import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] numbers = br.readLine().split(" ");

        int MAX = Integer.parseInt(numbers[0]);
        int MIN = Integer.parseInt(numbers[0]);;

        for (int i = 0; i < N; i++) {
            if (MAX < Integer.parseInt(numbers[i])) MAX = Integer.parseInt(numbers[i]);
            if (MIN > Integer.parseInt(numbers[i])) MIN = Integer.parseInt(numbers[i]);
        }

        bw.write(MIN + " " + MAX);
        bw.flush();
        br.close();
        bw.close();
    }
}