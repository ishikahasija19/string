import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    static void generateException(String[] arr, int idx) {
        System.out.println(arr[idx]);
    }
    static void handleException(String[] arr, int idx) {
        try {
            System.out.println(arr[idx]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = sc.next();
        int i = sc.nextInt();
       
        handleException(arr, i);
    }
}
