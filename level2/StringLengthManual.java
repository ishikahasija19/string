import java.util.Scanner;
public class StringLengthManual {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int manual = manualLength(s);
        int builtin = s.length();
        System.out.println("Manual length: " + manual);
        System.out.println("Built-in length: " + builtin);
    }
}