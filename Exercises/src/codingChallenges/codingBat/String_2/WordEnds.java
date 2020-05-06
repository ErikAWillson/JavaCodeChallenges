package codingChallenges.codingBat.String_2;

/*
Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string.
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
 */

public class WordEnds {
    public static void main(String[] args) {
        System.out.println(wordEnds("abcXY123XYijk", "XY"));
        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("XY1XY", "XY"));
    }

    public static String wordEnds(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length() - word.length() + 1; i++) {
            if (!str.substring(i, i + word.length()).equals(word)) continue;

            if (i -1 != -1) sb.append(str.charAt(i-1));
            if (i + word.length() < str.length()) sb.append(str.charAt(i+word.length()));
        }

        return sb.toString();
    }
}
