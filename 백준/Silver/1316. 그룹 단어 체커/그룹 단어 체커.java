import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            List<Character> list = new ArrayList<>();

            boolean flag = true;
            char prev = 0;
            for (char c : word.toCharArray()) {
                if (c != prev && list.contains(c)) {
                    flag = false;
                    break;
                } else {
                    list.add(c);
                }
                prev = c;
            }

            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}