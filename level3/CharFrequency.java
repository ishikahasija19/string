import java.util.Scanner;
public class CharFrequency {
    static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        int n = 0;
        try {
            while (true) {
                char c = s.charAt(n);
                freq[c]++;
                n++;
            }
        } catch (Exception e) {}
        boolean[] done = new boolean[256];
        int count = 0;
        for (int i = 0; i < n; i++)
            if (!done[s.charAt(i)]) {
                done[s.charAt(i)] = true;
                count++;
            }
        String[][] arr = new String[count][2];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (done[c]) {
                arr[idx][0] = String.valueOf(c);
                arr[idx][1] = String.valueOf(freq[c]);
                done[c] = false;
                idx++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] arr = charFrequency(s);
        System.out.println("Char\tFreq");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
    }
}