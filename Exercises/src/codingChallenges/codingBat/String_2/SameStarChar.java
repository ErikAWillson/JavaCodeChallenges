package codingChallenges.codingBat.String_2;

/*
Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.
 */

public class SameStarChar {
    public static void main(String[] args) {
        System.out.println(sameStarChar("xy*yzz"));
        System.out.println(sameStarChar("xy*zzz"));
        System.out.println(sameStarChar("*xa*az"));

    }

    public static boolean sameStarChar(String str) {
        int stringLength = str.length();
        for (int i = 1; i < stringLength - 1; i++) {
            if (str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1))
                return false;
        }

        return true;
    }
}
