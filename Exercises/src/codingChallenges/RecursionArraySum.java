package codingChallenges;/*
    Write a function that finds the sum of an array. Make your function recursive.
    Examples
sum([1, 2, 3, 4]) ➞ 10
sum([1, 2]) ➞ 3
sum([1]) ➞ 1
sum([]) ➞ 0
    Return 0 for an empty array.
 */

import java.util.Arrays;

public class RecursionArraySum {
    public static void main(String[] args) {
        System.out.println(recursiveSum(new int[]{1, 2, 3, 4}));
        System.out.println(recursiveSum(new int[]{1, 2}));
        System.out.println(recursiveSum(new int[]{1}));
        System.out.println(recursiveSum(new int[]{}));
        System.out.println(recursiveSum(new int[]{10,5,81}));
    }

    public static int recursiveSum(int[] numbers) {
        if (numbers.length == 0) return 0;
        if (numbers.length == 1) return numbers[0];

        return numbers[0]
                + recursiveSum(Arrays.copyOfRange(numbers, 1, numbers.length));
    }
}