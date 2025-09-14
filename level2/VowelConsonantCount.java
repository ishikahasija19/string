import java.util.Scanner;
public class VowelConsonantCount {
    static String charType(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    static int[] countVowelConsonant(String s) {
        int vowels = 0, consonants = 0;
        for (int i = 0; ; i++) {
            try {
                char c = s.charAt(i);
                String type = charType(c);
                if (type.equals("Vowel")) vowels++;
                else if (type.equals("Consonant")) consonants++;
            } catch (Exception e) {
                break;
            }
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVowelConsonant(s);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}