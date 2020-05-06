package codingChallenges.codingBat.String_2;

public class CatDog {

    public static void main(String[] args) {
        System.out.println(catDog("catdog"));
        System.out.println(catDog("catcat"));
        System.out.println(catDog("1cat1cadodog"));

    }

    public static boolean catDog(String str) {
        return countSubstring("cat", str) == countSubstring("dog", str);
    }

    private static int countSubstring(String sub, String str) {
        int count = 0;
        while (str.contains(sub)) {
            str = str.replaceFirst(sub, "");
            count++;
        }
        return count;
    }
}
