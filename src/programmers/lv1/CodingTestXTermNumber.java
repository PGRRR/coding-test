package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class CodingTestXTermNumber {
    public static void main(String[] args) {
        int x = 4;
        int n = 3;
        long[] answer = new long[n];
        for (long i = 1; i <= n; i++) {
            answer[(int) (i - 1)] = x * i;
        }
        System.out.println(Arrays.toString(answer));
    }
}
