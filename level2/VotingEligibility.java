import java.util.Scanner;
public class VotingEligibility {
    static int[] randomAges(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = 10 + (int)(Math.random() * 90);
        return arr;
    }
    static String[][] canVote(int[] ages) {
        String[][] arr = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            arr[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) arr[i][1] = "false";
            else arr[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return arr;
    }
    static void displayTable(String[][] arr) {
        System.out.println("Age\tCanVote");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ages = randomAges(n);
        String[][] arr = canVote(ages);
        displayTable(arr);
    }
}