package codingChallenges.codingBat.String_2;

public class BobThere {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }

    public static boolean bobThere(String str) {
        str = str.replaceFirst("b[a-zA-Z0-9]b", "bob");
        return str.contains("bob");
    }
}
