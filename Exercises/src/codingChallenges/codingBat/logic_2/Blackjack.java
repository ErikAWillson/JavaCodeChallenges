package codingChallenges.codingBat.logic_2;

public class Blackjack {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b) {
        return Math.max(valueOf(a), valueOf(b));
    }

    private static int valueOf(int x) {
        return x > 21 ? 0 : x;
    }
}
