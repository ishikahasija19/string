import java.util.Scanner;
public class StudentScoreCard {
    static int[][] randomScores(int n) {
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 3; j++)
                arr[i][j] = 40 + (int)(Math.random() * 61);
        return arr;
    }
    static double[][] calcTotals(int[][] scores) {
        double[][] arr = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100.0;
            arr[i][0] = total;
            arr[i][1] = Math.round(avg * 100.0) / 100.0;
            arr[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return arr;
    }
    static String[] calcGrades(double[][] arr) {
        String[] grades = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double perc = arr[i][2];
            if (perc >= 90) grades[i] = "A+";
            else if (perc >= 80) grades[i] = "A";
            else if (perc >= 70) grades[i] = "B";
            else if (perc >= 60) grades[i] = "C";
            else if (perc >= 50) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    static void displayScoreCard(int[][] scores, double[][] totals, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
        for (int i = 0; i < scores.length; i++)
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "\t" +
                    (int)totals[i][0] + "\t" + totals[i][1] + "\t" + totals[i][2] + "\t" + grades[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] scores = randomScores(n);
        double[][] totals = calcTotals(scores);
        String[] grades = calcGrades(totals);
        displayScoreCard(scores, totals, grades);
    }
}