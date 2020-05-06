package codingChallenges.codingBat.String_2;

import javax.print.DocFlavor;

public class StarOut {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));
        System.out.println(starOut("ab**cd"));
        System.out.println(starOut("sm*eilly"));

    }

    public static String starOut(String str) {
        StringBuilder sb = new StringBuilder();
        boolean previousWasStar = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*'
                    || (i-1 != -1 && str.charAt(i-1) == '*')
                    || (i+1 != str.length() && str.charAt(i+1) == '*')) {
                continue;
            }

            sb.append(str.charAt(i));
        }

        return sb.toString();
    }
}
