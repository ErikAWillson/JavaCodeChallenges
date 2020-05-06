package codingChallenges.codingBat.String_2;

/*
A sandwich is two pieces of bread with something in between.
Return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.
 */

public class GetSandwich {
    public static void main(String[] args) {
        System.out.println(getSandwich("breadjambread"));
        System.out.println(getSandwich("xxbreadjambreadyy"));
        System.out.println(getSandwich("xxbreadyy"));

    }

    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str. lastIndexOf("bread");

        if (first == -1 || last == first) return "";

        return str.substring(first + 5, last);
    }
}
