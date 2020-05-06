package codingChallenges.codingBat.String_2;

public class DoubleChar {

    public static void main(String[] args) {
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));

    }

    public static String doubleChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            sb.append(c + "" + c);
        }
        return sb.toString();
    }

}
