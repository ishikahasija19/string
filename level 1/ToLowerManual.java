import java.util.Scanner;
public class ToLowerManual {
    static String toLowerManual(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') sb.append((char)(c + 32));
            else sb.append(c);
        }
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
        String manual = toLowerManual(s);
        String builtin = s.toLowerCase();
        boolean same = compareByCharAt(manual, builtin);
        System.out.println("Manual toLower: " + manual);
        System.out.println("Built-in toLowerCase: " + builtin);
        System.out.println("Results same: " + same);
    }
}