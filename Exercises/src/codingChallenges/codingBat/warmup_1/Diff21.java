package codingChallenges.codingBat.warmup_1;

public class Diff21 {
    public static void main(String[] args) {
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(31));
    }

    public static int diff21(int n) {
        int diff = 21 - n;

        if(diff < 0) return diff * -2;

        return diff;
    }
}
