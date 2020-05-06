package codingChallenges.codingBat.String_2;

/*
Given a string, does "xyz" appear in the middle of the string?
To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.
This problem is harder than it looks.
 */

public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));

    }

    public static boolean xyzMiddle(String str) {
        int index = str.indexOf("xyz");
        while (index != -1) {
            int range = Math.abs(str.substring(0,index).length() - str.substring(index+3).length());

            if (range <= 1) return true;

            int tempIndex = str.substring(index + 2).indexOf("xyz");

            if(tempIndex != -1) index += 2 + tempIndex;
            else index = -1;
        }
        return false;
    }

}
