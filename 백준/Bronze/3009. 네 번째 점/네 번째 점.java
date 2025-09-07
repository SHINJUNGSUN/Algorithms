import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] point1 = {scanner.nextInt(), scanner.nextInt()};
        int[] point2 = {scanner.nextInt(), scanner.nextInt()};
        int[] point3 = {scanner.nextInt(), scanner.nextInt()};

        scanner.close();

        int fourthX = findMissingCoordinate(point1[0], point2[0], point3[0]);
        int fourthY = findMissingCoordinate(point1[1], point2[1], point3[1]);

        System.out.println(fourthX + " " + fourthY);
    }

    private static int findMissingCoordinate(int coord1, int coord2, int coord3) {
        if (coord1 == coord2) {
            return coord3;
        } else if (coord1 == coord3) {
            return coord2;
        } else {
            return coord1;
        }
    }
}