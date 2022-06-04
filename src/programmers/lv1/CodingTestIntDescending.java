package programmers.lv1;

import java.util.Arrays;

public class CodingTestIntDescending {
    public static void main(String[] args) {
        long n = 118372;
        char[] chars = Long.toString(n).toCharArray();
        Arrays.sort(chars);
        StringBuilder stringBuilder = new StringBuilder(new String(chars));
        stringBuilder.reverse();
        long answer = Long.parseLong(String.valueOf(stringBuilder));
        System.out.println(answer);
    }
}
