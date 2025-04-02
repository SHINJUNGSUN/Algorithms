import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];
        int MAX = 0;
        int INDEX = 0;


        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > MAX) {
                MAX = arr[i];
                INDEX = i + 1;
            }
        }

        System.out.println(MAX);
        System.out.println(INDEX);
    }
}