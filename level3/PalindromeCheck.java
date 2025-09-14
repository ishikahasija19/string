import java.util.Scanner;
public class PalindromeCheck {
    static boolean isPalindrome1(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    static boolean isPalindrome2(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindrome2(s, start + 1, end - 1);
    }
    static boolean isPalindrome3(String s) {
        char[] arr = s.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            rev[i] = s.charAt(arr.length - 1 - i);
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != rev[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean p1 = isPalindrome1(s);
        boolean p2 = isPalindrome2(s, 0, s.length() - 1);
        boolean p3 = isPalindrome3(s);
        System.out.println("Palindrome (logic 1): " + p1);
        System.out.println("Palindrome (logic 2): " + p2);
        System.out.println("Palindrome (logic 3): " + p3);
    }
}