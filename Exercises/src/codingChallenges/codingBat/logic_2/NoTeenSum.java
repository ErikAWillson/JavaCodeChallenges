package codingChallenges.codingBat.logic_2;

public class NoTeenSum {
    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));

    }

    public static int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public static int fixTeen(int n) {
        return ((13 <= n && n < 15)
                || 16 < n && n <= 19) ? 0 : n;
    }
}
