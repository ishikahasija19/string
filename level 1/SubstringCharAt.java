import java.util.Scanner;
public class SubstringCharAt {
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
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
        String sub1 = substringByCharAt(s, start, end);
        String sub2 = s.substring(start, end);
        boolean same = compareByCharAt(sub1, sub2);
        System.out.println("CharAt substring: " + sub1);
        System.out.println("Built-in substring: " + sub2);
        System.out.println("Substrings same: " + same);
    }
}