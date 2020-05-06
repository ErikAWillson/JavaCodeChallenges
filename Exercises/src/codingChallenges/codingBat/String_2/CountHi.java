package codingChallenges.codingBat.String_2;

public class CountHi {

    public static void main(String[] args) {
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));

    }

    public static int countHi(String str) {
        int count = 0;
        while(str.contains("hi")) {
            str = str.replaceFirst("hi", "");
            count++;
        }
        return count;
    }
}
