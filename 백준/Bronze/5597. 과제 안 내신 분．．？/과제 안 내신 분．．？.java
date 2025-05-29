import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] students = new int[30];

        while (sc.hasNextInt()) {
            students[sc.nextInt() - 1] = 1;
        }

        for (int i = 0; i < 30; i++) {
            if (students[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}