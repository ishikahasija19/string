import java.util.Scanner;
public class RockPaperScissors {
    static String computerChoice() {
        int n = (int)(Math.random() * 3);
        if (n == 0) return "rock";
        if (n == 1) return "paper";
        return "scissors";
    }
    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if (user.equals("rock") && comp.equals("scissors")) return 1;
        if (user.equals("scissors") && comp.equals("paper")) return 1;
        if (user.equals("paper") && comp.equals("rock")) return 1;
        return -1;
    }
    static String[][] stats(int userWins, int compWins, int games) {
        String[][] arr = new String[2][3];
        arr[0][0] = "User";
        arr[0][1] = String.valueOf(userWins);
        arr[0][2] = String.format("%.2f", (userWins * 100.0) / games);
        arr[1][0] = "Computer";
        arr[1][1] = String.valueOf(compWins);
        arr[1][2] = String.format("%.2f", (compWins * 100.0) / games);
        return arr;
    }
    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tResult");
        for (int i = 0; i < results.length; i++)
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        System.out.println("Player\tWins\tWin%");
        for (int i = 0; i < stats.length; i++)
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        String[][] results = new String[games][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            int win = winner(user, comp);
            results[i][0] = user;
            results[i][1] = comp;
            if (win == 1) {
                results[i][2] = "User";
                userWins++;
            } else if (win == -1) {
                results[i][2] = "Computer";
                compWins++;
            } else results[i][2] = "Draw";
        }
        String[][] statArr = stats(userWins, compWins, games);
        displayResults(results, statArr);
    }
}