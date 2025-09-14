import java.util.Scanner;
public class VowelConsonantType {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static String[][] charTypeArray(String s) {
        int n = 0;
        try {
            while (true) {
                s.charAt(n);
                n++;
            }
        } catch (Exception e) {
        }
        String[][] arr = new String[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = String.valueOf(s.charAt(i));
            arr[i][1] = charType(s.charAt(i));
        }
        return arr;
    }
    static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] arr = charTypeArray(s);
        displayTable(arr);
    }
}