package codingChallenges;

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(50);
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            boolean divBy3 = 0 == i % 3;
            boolean divBy5 = 0 == i % 5;

            if (!divBy3 && !divBy5) {
                System.out.println(i);
                continue;
            }

            if (divBy3) System.out.print("fizz");
            if (divBy5) System.out.print("buzz");
            System.out.println();
        }
    }
}
