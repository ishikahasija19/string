import java.util.Scanner;
public class UniqueCharacters {
    static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    static char[] uniqueChars(String s) {
        int n = manualLength(s);
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] unique = uniqueChars(s);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        System.out.println();
    }
}