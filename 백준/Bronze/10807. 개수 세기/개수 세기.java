import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String[] strArr = br.readLine().split(" ");
        int M = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (String str : strArr) {
            if(Integer.parseInt(str) == M) {
                cnt++;
            }
        }

        bw.write(cnt + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}