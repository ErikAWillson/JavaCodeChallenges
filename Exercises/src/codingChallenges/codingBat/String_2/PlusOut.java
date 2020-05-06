package codingChallenges.codingBat.String_2;

/*
Given a string and a non-empty word string,
 return a version of the original String where all chars have been replaced by pluses ("+"),
 except for appearances of the word string which are preserved unchanged.
 */

public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy34", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));
        System.out.println(plusOut("abXYabcXYZ", "abc"));
        System.out.println(plusOut("abXYxyzXYZ", "XYZ"));

    }

    public static String plusOut(String str, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i+word.length() > str.length()
                    || !str.substring(i, i + word.length()).equals(word))
                sb.append('+');
            else {
                sb.append(word);
                i += (word.length() - 1);
            }
        }

        return sb.toString();
    }
}
