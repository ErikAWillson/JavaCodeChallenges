package codingChallenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String ourWord = "racecar";
        System.out.println(ourWord + ": " + isPalindrome(ourWord));
        ourWord = "Anna";
        System.out.println(ourWord + ": " + isPalindrome(ourWord));
        ourWord = "table";
        System.out.println(ourWord + ": " + isPalindrome(ourWord));
        ourWord = "John";
        System.out.println(ourWord + ": " + isPalindrome(ourWord));
        System.out.println(System.currentTimeMillis() - startTime);
    }

    private static boolean isPalindrome(String word) {
//        Alternatively:
//        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
//        System.out.println(sb.reverse());

        int wordLength = word.length();

        for (int i = 0; i < wordLength - i - 1; i++) {
            if (word.toLowerCase().charAt(i) != word.toLowerCase().charAt(wordLength -i - 1))
                return false;
        }

        return true;
    }
}
