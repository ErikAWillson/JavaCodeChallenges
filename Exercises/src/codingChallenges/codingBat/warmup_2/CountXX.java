package codingChallenges.codingBat.warmup_2;

public class CountXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));

    }

    static int countXX(String str) {
        int count = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(i - 1, i + 1).equals("xx")) count++;
        }
        return count;
    }

}
