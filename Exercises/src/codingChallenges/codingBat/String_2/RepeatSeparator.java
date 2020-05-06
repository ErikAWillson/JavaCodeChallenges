package codingChallenges.codingBat.String_2;

/*
Given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string.
 */

public class RepeatSeparator {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));
        System.out.println(repeatSeparator("This", "And", 2));
        System.out.println(repeatSeparator("This", "And", 1));

    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(word);
            if (i < count -1) sb.append(sep);
        }
        return sb.toString();
    }

}
