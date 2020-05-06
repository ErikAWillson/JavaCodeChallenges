package codingChallenges.codingBat.String_2;

public class CountCode {

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb"));
        System.out.println(countCode("codexxcode"));
        System.out.println(countCode("cozexxcope"));

    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() -3; i++) {
            if (isCode(str.substring(i, i+4))) {
                count++;
                i += 3;
            }
        }
        return count;
    }

    private static boolean isCode(String str) {
        return str.charAt(0) == 'c'
                && str.charAt(1) == 'o'
                && str.charAt(3) == 'e';
    }
}
