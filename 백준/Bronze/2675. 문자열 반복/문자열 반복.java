import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < N; i++) {
            String[] strArr = sc.nextLine().split(" ");
            int M = Integer.parseInt(strArr[0]);
            for (char ch : strArr[1].toCharArray()) {
                for (int j = 0; j < M; j++) {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}