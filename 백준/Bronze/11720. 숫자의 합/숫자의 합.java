import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int ans = 0;
        
        for (int i = 0; i < N; i++) {
            ans += Integer.parseInt(String.valueOf(str.charAt(i)));
        }

        bw.write(String.valueOf(ans));
        bw.flush();

        br.close();
        bw.close();
    }
}