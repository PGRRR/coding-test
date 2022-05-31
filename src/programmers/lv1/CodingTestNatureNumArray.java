package programmers.lv1;

import java.util.Arrays;

public class CodingTestNatureNumArray {
    public static void main(String[] args) {
        long n = 12345;
        String str = n+"";
        int[] answer = new int[str.length()];
        for (int i = 0; i < answer.length; i++) {
            answer[answer.length-i-1] = str.charAt(i)-48;
        }
        System.out.println(Arrays.toString(answer));

    }
}
