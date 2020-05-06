package codingChallenges.codingBat.warmup_2;

import java.util.Arrays;

public class Array123 {
    public static void main(String[] args) {
        int[] intArray = {1, 1, 2, 3, 1};
        System.out.println(array123(intArray));
        int[] intArray2 = {1, 1, 2, 4, 1};
        System.out.println(array123(intArray2));
        int[] intArray3 = {1, 1, 2, 1, 2, 3};
        System.out.println(array123(intArray3));

        int[] intArray4 = {1, 9, 5};
        System.out.println(array123(intArray4));
    }

    public static boolean array123(int[] nums) {
        return Arrays.toString(nums).contains("1, 2, 3");
    }
}
