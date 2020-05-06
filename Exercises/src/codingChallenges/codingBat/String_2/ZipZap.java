package codingChallenges.codingBat.String_2;

public class ZipZap {
    public static void main(String[] args) {
        System.out.println(zipZap("zipXzap"));
        System.out.println(zipZap("zopzop"));
        System.out.println(zipZap("zzzopzop"));

    }

    public static String zipZap(String str) {
        StringBuilder sb = new StringBuilder();
        int strLength = str.length();
        for (int i = 0; i < strLength; i++) {
            if (i+3 > strLength) {
                sb.append(str.substring(i));
                break;
            }

            char letter = str.charAt(i);
            if (letter == 'z' && str.charAt(i+2) == 'p') {
                sb.append("zp");
                i += 2;
            } else {
                sb.append(letter);
            }
        }

        return sb.toString();
    }
}
