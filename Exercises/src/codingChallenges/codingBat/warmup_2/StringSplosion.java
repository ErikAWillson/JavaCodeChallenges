package codingChallenges.codingBat.warmup_2;

public class StringSplosion {

    public static void main(String[] args) {
        System.out.println(stringSplosion("Code"));
        System.out.println(stringSplosion("abc"));
        System.out.println(stringSplosion("ab"));

    }

    public static String stringSplosion(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            sb.append(str.substring(0,i));
        }
        return sb.toString();
    }
}
