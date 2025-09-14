import java.util.Scanner;
public class FirstNonRepeatingChar {
    static char firstNonRepeating(String s) {
        int[] freq = new int[256];
        int n = 0;
        try {
            while (true) {
                char c = s.charAt(n);
                freq[c]++;
                n++;
            }
        } catch (Exception e) {}
        for (int i = 0; i < n; i++)
            if (freq[s.charAt(i)] == 1) return s.charAt(i);
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char res = firstNonRepeating(s);
        if (res == 0) System.out.println("No non-repeating character");
        else System.out.println("First non-repeating character: " + res);
    }
}