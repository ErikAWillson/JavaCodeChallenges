package codingChallenges.codingBat.String_2;

public class OneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));

    }

    public static String oneTwo(String str) {
        StringBuilder sb = new StringBuilder();
        int strLength = str.length();
        for (int i = 0; i < strLength; i += 3) {
            if (i + 3 > strLength)
                break;
            else {
                sb.append(str.substring(i+1, i+3));
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
