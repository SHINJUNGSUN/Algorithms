import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Character[][] M = new Character[5][15];

        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < line.length(); j++) {
                M[i][j] = line.charAt(j);
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if(M[j][i] != null) {
                    System.out.print(M[j][i]);
                }
            }
        }
    }
}