package codingChallenges.codingBat.logic_2;

import java.util.ArrayList;

public class EvenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2,4,6));
        System.out.println(evenlySpaced(4,6,2));
        System.out.println(evenlySpaced(4,6,3));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);

        Integer large = Math.max(Math.max(a, b), c);
        numbers.remove(large);

        Integer medium = Math.max(numbers.get(0), numbers.get(1));
        numbers.remove(medium);

        Integer small = numbers.get(0);

        return large - medium == medium - small;
    }
}
