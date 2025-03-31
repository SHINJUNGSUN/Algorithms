import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[9];
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        int[] ans = new int[7];
        boolean found = false;
        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - (arr[i] + arr[j]) == 100) {
                    int ansIndex = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            ans[ansIndex++] = arr[k];
                        }
                    }
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        insertionSort(ans);

        for (int i = 0; i < 7; i++) {
            bw.write(String.valueOf(ans[i]));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    for (int k = i; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
        }
    }
}