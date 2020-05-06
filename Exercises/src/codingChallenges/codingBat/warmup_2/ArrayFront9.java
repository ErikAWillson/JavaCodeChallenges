package codingChallenges.codingBat.warmup_2;

import java.util.Arrays;

public class ArrayFront9 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 9, 3, 4};
        System.out.println(arrayFront9(intArray));
        int[] intArray2 = {1, 2, 3, 4, 9};
        System.out.println(arrayFront9(intArray2));
        int[] intArray3 = {1, 2, 3, 4, 5};
        System.out.println(arrayFront9(intArray3));

        int[] intArray4 = {1, 9, 5};
        System.out.println(arrayFront9(intArray4));
    }

    public static boolean arrayFront9(int[] nums) {
        return Arrays
                .toString(Arrays.copyOfRange(nums, 0, 4))
                .contains("9");
    }
}
