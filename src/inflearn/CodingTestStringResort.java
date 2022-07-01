package inflearn;

import java.util.Arrays;

public class CodingTestStringResort {
    public static void main(String[] args) {
        String str = "K1KA5CB7";
        char[] chArr = str.toCharArray();
        StringBuilder answer = new StringBuilder();
        Arrays.sort(chArr);
        int sum = 0;
        for (char ch : chArr) {
            if ('0' < ch && ch <= '9') {
                sum += ch - 48;
            } else {
                answer.append(ch);
            }
        }
        answer.append(sum);
        System.out.println(answer);
    }
}
