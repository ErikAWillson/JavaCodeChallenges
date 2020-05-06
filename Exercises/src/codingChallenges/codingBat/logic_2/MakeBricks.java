package codingChallenges.codingBat.logic_2;

public class MakeBricks {
    public static void main(String[] args) {
        System.out.println(makeBricks(3,1,8));
        System.out.println(makeBricks(3,1,9));
        System.out.println(makeBricks(3,2,10));
    }

    public static boolean makeBricks(int small, int big, int goal) {
        boolean enoughSmalls = small - (goal % 5) >= 0;
        boolean enoughTotal = (big * 5 + small) >= goal;

        return enoughSmalls && enoughTotal;
    }
}
