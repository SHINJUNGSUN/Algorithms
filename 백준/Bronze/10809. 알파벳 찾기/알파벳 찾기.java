import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        int[] firstIndex = new int[26];
        for (int i = 0; i < 26; i++) {
            firstIndex[i] = -1;
        }

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (firstIndex[idx] == -1) {
                firstIndex[idx] = i;
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            result.append(firstIndex[i]).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}