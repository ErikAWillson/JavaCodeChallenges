package codingChallenges.codingBat.warmup_1;

public class SumDouble {
    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(3,2));
        System.out.println(sumDouble(2,2));
    }

    public static int sumDouble(int a, int b) {
        int sum = a+b;
        if (a==b) return sum*2;
        return sum;
    }
}