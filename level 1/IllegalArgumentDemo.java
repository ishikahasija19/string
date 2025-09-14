import java.util.Scanner;
public class IllegalArgumentDemo {
    static void generateException(String s, int start, int end) {
        System.out.println(s.substring(start, end));
    }
    static void handleException(String s, int start, int end) {
        try {
            System.out.println(s.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();
      
        handleException(s, end, start);
    }
}