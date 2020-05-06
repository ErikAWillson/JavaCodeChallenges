package codingChallenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(anagram("finder", "friend"));
        System.out.println(anagram("hello", "bye"));
        System.out.println(anagram("Dad", "add"));
        System.out.println(anagram("The big king.", "I beg, knight!"));
    }

    public static boolean anagram(String str1, String str2) {
        char[] s1Array = stringToAlphaCharsArray(str1);
        List s2List = stringToAlphaArrayList(str2);

        for (char a : s1Array) {
            String strA = String.valueOf(a);

            if (!s2List.contains(strA)) return false;

            s2List.remove(strA);
        }

        return true;
    }

    private static char[] stringToAlphaCharsArray(String str1) {
        return str1
                .replaceAll("[^a-zA-Z ]", "")
                .toLowerCase()
                .toCharArray();
    }

    private static ArrayList stringToAlphaArrayList(String str2) {
        return new ArrayList<String>(
                Arrays.asList(
                        str2
                        .replaceAll("[^a-zA-Z ]", "")
                        .toLowerCase()
                        .split("")));
    }
}
