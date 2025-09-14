public class DeckOfCards {
    static String[] initDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int idx = 0;
        for (String suit : suits)
            for (String rank : ranks)
                deck[idx++] = rank + " of " + suit;
        return deck;
    }
    static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
    static String[][] distribute(String[] deck, int n, int players) {
        if (n * players > deck.length) return null;
        String[][] arr = new String[players][n];
        int idx = 0;
        for (int i = 0; i < players; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = deck[idx++];
        return arr;
    }
    static void printPlayers(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = initDeck();
        shuffleDeck(deck);
        int n = 5;
        int players = 4;
        String[][] arr = distribute(deck, n, players);
        if (arr == null) System.out.println("Not enough cards");
        else printPlayers(arr);
    }
}