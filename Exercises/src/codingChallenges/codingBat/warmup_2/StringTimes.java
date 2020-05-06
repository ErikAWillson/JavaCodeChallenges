package codingChallenges.codingBat.warmup_2;

public class StringTimes {
    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println(stringTimes("Hi", 0));
    }
    public static String stringTimes(String str, int n) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbStr.append(str);
        }
        return sbStr.toString();
    }
}
