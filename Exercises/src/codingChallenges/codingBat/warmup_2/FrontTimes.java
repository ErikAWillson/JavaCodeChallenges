package codingChallenges.codingBat.warmup_2;

public class FrontTimes {
    public static void main(String[] args) {
        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));
        System.out.println(frontTimes("Ab", 3));

    }

    public static String frontTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        String frontString = str.length() > 2 ? str.substring(0, 3) : str;
        for (int i = 0; i < n; i++) {
            result.append(frontString);
        }
        return result.toString();
    }

}