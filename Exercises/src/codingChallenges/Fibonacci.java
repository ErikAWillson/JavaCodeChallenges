package codingChallenges;

public class Fibonacci {
    public static void main(String[] args) {
        int numberOfFibonacci = 50;

        long startTime = System.currentTimeMillis();

        for (int i = 1; i <= numberOfFibonacci; i++) {
//            nthFibonacci(i);
            System.out.println(nthFibonacci(i));
        }

        long midTime = System.currentTimeMillis();

        for (int i = 1; i <= numberOfFibonacci; i++) {
//            fibonacci(i);
            System.out.println(fibonacci(i));
        }

        long endTime = System.currentTimeMillis();

        System.out.println();
        System.out.println(midTime - startTime);
        System.out.println((endTime - midTime));
    }

    public static long nthFibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        long m1 = 0;
        long m2 = 1;

        for (int i = 3; i <= n; i++) {
            long temp = m2 + m1;
            m1 = m2;
            m2 = temp;
        }

        return m2;
    }

    public static long fibonacci(int n)  {
        if(n == 1)
            return 0;
        else if(n == 2)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}