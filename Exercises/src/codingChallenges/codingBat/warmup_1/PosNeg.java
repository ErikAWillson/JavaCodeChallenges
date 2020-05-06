package codingChallenges.codingBat.warmup_1;

public class PosNeg {
    public static void main(String[] args) {
        System.out.println(posNeg(1,-1,false));
        System.out.println(posNeg(-1,1,false));
        System.out.println(posNeg(-4,-5,true));
    }

    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative) return a < 0 && b < 0;

        return (a < 0 && b > 0) || (a > 0 && b < 0);
    }

}