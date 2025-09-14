import java.util.Scanner;
public class SplitWordsManual {
    static int manualLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
    static String[] manualSplit(String s) {
        int n = manualLength(s);
        int wordCount = 1;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == ' ') wordCount++;
        int[] spaceIdx = new int[wordCount + 1];
        int idx = 0;
        spaceIdx[idx++] = -1;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == ' ') spaceIdx[idx++] = i;
        spaceIdx[idx] = n;
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            int start = spaceIdx[i] + 1;
            int end = spaceIdx[i + 1];
            StringBuilder sb = new StringBuilder();
            for (int j = start; j < end; j++) sb.append(s.charAt(j));
            words[i] = sb.toString();
        }
        return words;
    }
    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] manual = manualSplit(s);
        String[] builtin = s.split(" ");
        boolean same = compareArrays(manual, builtin);
        System.out.print("Manual split: ");
        for (String w : manual) System.out.print(w + " ");
        System.out.println();
        System.out.print("Built-in split: ");
        for (String w : builtin) System.out.print(w + " ");
        System.out.println();
        System.out.println("Results same: " + same);
    }
}