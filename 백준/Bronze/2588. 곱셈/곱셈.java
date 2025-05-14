import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        String B = sc.next();

        for(int i = B.length(); i > 0; i--) {
            System.out.println(A * Character.getNumericValue(B.charAt(i - 1)));
        }

        System.out.println(A * Integer.parseInt(B));
    }
}