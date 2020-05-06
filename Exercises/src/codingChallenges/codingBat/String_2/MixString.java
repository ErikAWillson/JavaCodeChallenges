package codingChallenges.codingBat.String_2;
/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on.
Any leftover chars go at the end of the result.
 */

public class MixString {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));

    }

    public static String mixString(String a, String b) {
        StringBuilder aTemp = new StringBuilder();
        StringBuilder bTemp = new StringBuilder();
        StringBuilder result = new StringBuilder();

        aTemp.append(a);
        bTemp.append(b);
        while (aTemp.length() > 0 && bTemp.length() > 0) {
            result.append(aTemp.substring(0,1) + bTemp.substring(0,1));
            aTemp.replace(0, 1, "");
            bTemp.replace(0,1,"");
        }

        return result.append(aTemp.toString() + bTemp.toString()).toString();
    }
}
