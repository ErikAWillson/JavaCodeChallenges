package codingChallenges.codingBat.logic_2;

public class CloseFar {
    public static void main(String[] args) {
        System.out.println(closeFar(1,2,10));
        System.out.println(closeFar(1,2,3));
        System.out.println(closeFar(4,1,3));
    }

    public static boolean closeFar(int a, int b, int c) {
        return (isClose(a, b) && isFar(a, b, c))
                || (isClose(a, c) && isFar(a, c, b));
    }

    private static boolean isClose(int a, int x) {
        return Math.abs(a - x) <= 1;
    }

    private static boolean isFar(int a, int b, int x) {
        return !isClose(a, x) && !isClose(b, x);
    }
}
