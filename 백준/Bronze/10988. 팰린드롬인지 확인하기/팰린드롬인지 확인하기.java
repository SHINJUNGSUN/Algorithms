import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        char[] chars = new char[word.length()];

        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(word.length() - (i + 1));
        }

        String word2 = new String(chars);
        System.out.println(word.equals(word2) ? 1 : 0);
   }
}