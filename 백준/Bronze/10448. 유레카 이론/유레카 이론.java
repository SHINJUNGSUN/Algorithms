import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        while (br.ready()) {
            int A = Integer.parseInt(br.readLine());
            boolean flag = false;
            for (int i = 1; i * (i + 1) / 2 <= 1000; i++) {
                int I = i * (i + 1) / 2;
                for (int j = 1; j * (j + 1) / 2 <= 1000; j++) {
                    int J = j * (j + 1) / 2;
                    for (int k = 1; k * (k + 1) / 2 <= 1000; k++) {
                        int K = k * (k + 1) / 2;
                        if (I + J + K == A) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
            bw.write(flag ? "1" : "0");
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}