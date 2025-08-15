import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] grades = { "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F" };
        double[] points = { 4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0 };

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < 20; i++) {
            String[] input = sc.nextLine().split(" ");

            double credit = Double.parseDouble(input[1]);
            String grade = input[2];

            if ("P".equals(grade)) {
                continue;
            }

            int gradeIndex = 0;
            for (int j = 0; j < grades.length; j++) {
                if (grades[j].equals(grade)) {
                    gradeIndex = j;
                    break;
                }
            }

            totalCredits += credit;
            totalGradePoints += credit * points[gradeIndex];
        }

        System.out.printf("%.6f%n", totalGradePoints / totalCredits);
    }
}