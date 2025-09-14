import java.util.Scanner;
public class CalendarDisplay {
    static String monthName(int m) {
        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return months[m - 1];
    }
    static int daysInMonth(int m, int y) {
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (m == 2 && isLeapYear(y)) return 29;
        return days[m - 1];
    }
    static boolean isLeapYear(int y) {
        if (y % 4 != 0) return false;
        if (y % 100 != 0) return true;
        return y % 400 == 0;
    }
    static int firstDay(int y, int m) {
        int d = 1;
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("   " + monthName(m) + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(y, m);
        int days = daysInMonth(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int i = 1; i <= days; i++) {
            System.out.printf("%3d ", i);
            if (((i + start) % 7 == 0) || (i == days)) System.out.println();
        }
    }
}