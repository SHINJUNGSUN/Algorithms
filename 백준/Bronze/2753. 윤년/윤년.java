import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int YEAR = sc.nextInt();

        if (YEAR % 4 == 0 && YEAR % 100 != 0 || YEAR % 400 == 0) System.out.println(1);
        else System.out.println(0);
    }
}