import java.util.Scanner;
public class SplitWordsWithLength {
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
    static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(manualLength(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = manualSplit(s);
        String[][] arr = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + "\t" + Integer.parseInt(arr[i][1]));
    }
}