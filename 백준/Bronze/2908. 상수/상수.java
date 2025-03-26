import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArr = sc.nextLine().split(" ");
        
        StringBuilder A = new StringBuilder();
        for (int i = strArr[0].length() - 1; i >= 0; i--) {
            A.append(strArr[0].charAt(i));
        }

        StringBuilder B = new StringBuilder();
        for (int i = strArr[1].length() - 1; i >= 0; i--) {
            B.append(strArr[1].charAt(i));
        }

        System.out.println(Integer.parseInt(A.toString()) > Integer.parseInt(B.toString()) ? A.toString() : B.toString());
    }
}