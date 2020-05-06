package codingChallenges.codingBat.warmup_1;

public class ParrotTrouble {
    public static void main(String[] args) {
        System.out.println(ParrotTrouble(true, 6));
        System.out.println(ParrotTrouble(true, 7));
        System.out.println(ParrotTrouble(false, 6));
    }

    public static boolean ParrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }
}