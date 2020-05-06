package codingChallenges.codingBat.String_2;

/*
Given a string, consider the prefix string made of the first N chars of the string.
 Does that prefix string appear somewhere else in the string?
 Assume that the string is not empty and that N is in the range 1..str.length().
 */

public class PrefixAgain {
    public static void main(String[] args) {
        System.out.println(prefixAgain("abXYabc", 1));
        System.out.println(prefixAgain("abXYabc", 2));
        System.out.println(prefixAgain("abXYabc", 3));

    }

    public static boolean prefixAgain(String str, int n) {
        String sub = str.substring(0, n);
        return str.substring(n).contains(sub);
    }

}
