import java.util.Scanner;

public class Main {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'A']++;
        }
        return count;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int[] count = getAlphabetCount(str.toUpperCase());

        int max = 0;
        char ans = '?';
        for(int i = 0; i < count.length; i++) {
            if(max < count[i]) {
                max = count[i];
                ans = (char)('A' + i);
            } else if(max == count[i]) {
                ans = '?';
            }
        }

        System.out.println(ans);
    }
}
