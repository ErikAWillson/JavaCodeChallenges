package codingChallenges.codingBat.warmup_2;

public class DoubleX {
    public static void main(String[] args) {
        System.out.println(doubleXAlt2("axxbb"));
        System.out.println(doubleXAlt2("axaxax"));
        System.out.println(doubleXAlt2("xxxxx"));

    }

    static boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            String strX = str.substring(i, i + 2);
            if (strX.substring(0, 1).equals("x")) {
                return strX.equals("xx");
            }
        }

        return false;
    }

    static boolean doubleXAlt(String str) {
        int indexOfX = str.indexOf("x");
        if (indexOfX == -1 || indexOfX == str.length() - 1) return false;

        return str.substring(indexOfX, indexOfX + 2).equals("xx");
    }

    static boolean doubleXAlt2(String str) {
        int indexOfX = str.indexOf("x");
        if (indexOfX == -1) return false;

        return str.substring(indexOfX).startsWith("xx");
    }
}
