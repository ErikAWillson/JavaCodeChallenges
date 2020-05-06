package codingChallenges;

import java.util.HashMap;

public class FindTheVowels {
    public static void main(String[] args) {
        System.out.println(numberOfVowels("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(numberOfVowels("Mary had a little lamb."));
        System.out.println(numberOfVowels("The big king begs the knight"));
    }

    public static int numberOfVowels(String str) {
        String s = str.toLowerCase();
        int total = count(s, "a");
        total += count(s, "e");
        total += count(s, "i");
        total += count(s, "o");
        total += count(s, "u");
      //  HashMap h =
        return total;
    }

    private static int count(String str, String a) {
        return str.length() - str.replaceAll(a, "").length();
    }
}