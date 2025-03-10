import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        int startIndex = 0;
        int count = 0;
        while (true) {
            int findIndex = a.indexOf(b, startIndex);
            if (findIndex < 0)
                break;
            startIndex = findIndex + b.length();
            count++;
        }

        System.out.println(count);
    }
}