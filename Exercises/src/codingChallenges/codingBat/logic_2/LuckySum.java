package codingChallenges.codingBat.logic_2;

public class LuckySum {
    public static void main(String[] args) {
        System.out.println(luckySum(1, 2, 3));
        System.out.println(luckySum(1, 2, 13));
        System.out.println(luckySum(1, 13, 3));
        System.out.println(luckySum(13, 2, 3));

    }

    public static int luckySum(int a, int b, int c) {
        int[] numbers = {a, b, c};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 13) break;
            else sum += numbers[i];
        }
        return sum;
    }

    public static int luckySumAlt(int a, int b, int c) {
        int sum = 0;

        if (a == 13) return sum;
        else sum += a;

        if (b == 13) return sum;
        else sum += b;

        if (c == 13) return sum;
        else return sum + c;
    }
}
