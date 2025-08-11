import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String word = sc.nextLine();

        for (String a : alphabet) {
            word = word.replace(a, "*");
        }

        System.out.println(word.length());
    }
}