package codingChallenges.codingBat.logic_2;

import java.awt.*;

public class MakeChocolate {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4,1,9));
        System.out.println(makeChocolate(4,1,10));
        System.out.println(makeChocolate(4,1,7));

    }

    public static int makeChocolate(int small, int big, int goal) {
        for (int i = big; i > 0; i--) {
            if (goal < 5) break;

            goal -= 5;
        }

        return small >= goal ? goal : -1;
    }
}
