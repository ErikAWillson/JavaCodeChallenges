package codingChallenges.codingBat.warmup_1;

public class NotString {
    public static void main(String[] args) {
        System.out.println(notString("candy"));
        System.out.println(notString("x"));
        System.out.println(notString("not bad"));
    }

    public static String notString(String str) {
        if (str.length() > 2
                && str.substring(0,3).equals("not")) return str;

        return "not " + str;
    }
}
