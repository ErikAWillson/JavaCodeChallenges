package codingChallenges.codingBat.logic_2;

public class LoneSum {
    public static void main(String[] args) {
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
    }

    public static int loneSum(int a, int b, int c) {
        int sum = 0;
        boolean aEqualsB = a==b;
        boolean aEqualsC = a==c;
        boolean bEqualsC = b==c;

        if (!aEqualsB && !aEqualsC) sum += a;
        if (!aEqualsB && !bEqualsC) sum += b;
        if (!aEqualsC && !bEqualsC) sum += c;

        return sum;
    }
}
