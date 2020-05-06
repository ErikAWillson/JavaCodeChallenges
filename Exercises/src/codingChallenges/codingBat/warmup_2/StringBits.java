package codingChallenges.codingBat.warmup_2;

public class StringBits {

    public static void main(String[] args) {
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));

    }

    public static String stringBits(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
