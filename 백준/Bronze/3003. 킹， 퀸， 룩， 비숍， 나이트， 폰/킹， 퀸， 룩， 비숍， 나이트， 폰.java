import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 1, 2, 2, 2, 8};

        for (int j : arr) {
            int A = sc.nextInt();
            System.out.print(j - A + " ");
        }
   }
}