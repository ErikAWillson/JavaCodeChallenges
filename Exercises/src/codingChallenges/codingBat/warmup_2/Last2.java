package codingChallenges.codingBat.warmup_2;

public class Last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));

    }

    public static int last2(String str) {
        int strLength = str.length();
        if (strLength < 3) return 0;

        String last2Letters = str.substring(strLength - 2); // Note: substring() with 1 value goes through the end of the string

        int count = 0;
        for (int i = 2; i < strLength; i++) {
            if (str.substring(i - 2, i).equals(last2Letters)) count++;
        }

        return count;
    }
}
