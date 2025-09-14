import java.util.Scanner;
public class StringToCharArrayManual {
    static char[] manualToCharArray(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        return arr;
    }
    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr1 = manualToCharArray(s);
        char[] arr2 = s.toCharArray();
        boolean same = compareCharArrays(arr1, arr2);
        System.out.println("Manual toCharArray: " + new String(arr1));
        System.out.println("Built-in toCharArray: " + new String(arr2));
        System.out.println("Arrays same: " + same);
    }
}