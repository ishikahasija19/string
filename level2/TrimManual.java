import java.util.Scanner;
public class TrimManual {
    static int[] trimIndexes(String s) {
        int n = 0;
        try {
            while (true) {
                s.charAt(n);
                n++;
            }
        } catch (Exception e) {
        }
        int start = 0, end = n - 1;
        while (start < n && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }
    static String substringByCharAt(String s, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i < end && i < s.length(); i++)
            sb.append(s.charAt(i));
        return sb.toString();
    }
    static boolean compareByCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++)
            if (s1.charAt(i) != s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] idx = trimIndexes(s);
        String manual = substringByCharAt(s, idx[0], idx[1]);
        String builtin = s.trim();
        boolean same = compareByCharAt(manual, builtin);
        System.out.println("Manual trim: " + manual);
        System.out.println("Built-in trim: " + builtin);
        System.out.println("Results same: " + same);
    }
}