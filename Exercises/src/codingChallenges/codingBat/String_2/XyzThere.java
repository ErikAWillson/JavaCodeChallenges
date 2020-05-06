package codingChallenges.codingBat.String_2;

public class XyzThere {

    public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz"));
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("xyz.abc"));

    }

    public static boolean xyzThere(String str) {
        str = str.replace(".xyz", "");
        return str.contains("xyz");
    }

}
