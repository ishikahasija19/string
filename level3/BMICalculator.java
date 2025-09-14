import java.util.Scanner;
public class BMICalculator {
    static double[][] inputData(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] arr = new double[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextDouble();
            arr[i][1] = sc.nextDouble();
        }
        return arr;
    }
    static String[][] bmiStatus(double[][] arr) {
        String[][] res = new String[arr.length][4];
        for (int i = 0; i < arr.length; i++) {
            double weight = arr[i][0];
            double heightCm = arr[i][1];
            double heightM = heightCm / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            res[i][0] = String.format("%.2f", heightCm);
            res[i][1] = String.format("%.2f", weight);
            res[i][2] = String.format("%.2f", bmi);
            res[i][3] = status;
        }
        return res;
    }
    static void display(String[][] arr) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i][0] + "\t\t" + arr[i][1] + "\t\t" + arr[i][2] + "\t" + arr[i][3]);
    }
    public static void main(String[] args) {
        int n = 10;
        double[][] data = inputData(n);
        String[][] result = bmiStatus(data);
        display(result);
    }
}