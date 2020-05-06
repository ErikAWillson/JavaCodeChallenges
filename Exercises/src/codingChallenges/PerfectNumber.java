package codingChallenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class PerfectNumber {
    public static void main(String[] args) {
        for (int i = 1; i <= 496; i++) {
            System.out.println(i + ": " + checkPerfect(i));
        }
    }

    public static boolean checkPerfect(int number) {
        int[] factors = findFactors(number);
        int sumOfFactors = IntStream.of(factors).sum();

        return number == sumOfFactors;
    }

    private static int[] findFactors(int number) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= number/2; i++) {
            if (0 == number%i)
                factors.add(i);
        }

        return factors.stream().mapToInt(Integer::intValue).toArray();
    }
}