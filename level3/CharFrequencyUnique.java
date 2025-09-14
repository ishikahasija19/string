import java.util.Scanner;
public class CharFrequencyUnique {
    static char[] uniqueChars(String s) {
        int n = 0;
        try {
            while (true) {
                s.charAt(n);
                n++;
            }
        } catch (Exception e) {}
        char[] temp = new char[n];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c) unique = false;
            if (unique) temp[idx++] = c;
        }
        char[] res = new char[idx];
        for (int i = 0; i < idx; i++) res[i] = temp[i];
        return res;
    }
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
        char[] unique = uniqueChars(s);
        String[][] arr = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            arr[i][0] = String.valueOf(unique[i]);
            arr[i][1] = String.valueOf(freq[unique[i]]);
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