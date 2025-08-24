import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        
        int result = 0;

        for (char c : N.toCharArray()) {
            result = result * B + Character.getNumericValue(c);
        }
        
        System.out.println(result);
    }
}