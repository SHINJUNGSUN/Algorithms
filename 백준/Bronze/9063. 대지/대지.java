import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        if (N < 2) {
            System.out.println(0);
            return; // 여기서 종료
        }
        
        int MAX_X = Integer.MIN_VALUE;
        int MIN_X = Integer.MAX_VALUE;
        int MAX_Y = Integer.MIN_VALUE;
        int MIN_Y = Integer.MAX_VALUE;
        
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            MAX_X = Math.max(X, MAX_X);
            MIN_X = Math.min(X, MIN_X);
            MAX_Y = Math.max(Y, MAX_Y);
            MIN_Y = Math.min(Y, MIN_Y);
        }
        
        System.out.println((MAX_X - MIN_X) * (MAX_Y - MIN_Y));
    }
}