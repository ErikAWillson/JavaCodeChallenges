package codingChallenges.codingBat.warmup_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCount9 {
    public static void main(String[] args) {
        int[] intArray = {1,2,9};
        System.out.println(arrayCount9(intArray));
        int[] intArray2 = {1,9,9};
        System.out.println(arrayCount9(intArray2));
        int[] intArray3 = {1,9,9,3,9};
        System.out.println(arrayCount9(intArray3));

    }

    public static int arrayCount9(int[] nums) {
        return Arrays.toString(nums)
                .replaceAll("[^9]","")
                .length();
    }
}
