package programmers.lv2;

import java.util.Arrays;

public class CodingTestScoville {
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int answer = 0;
        if (scoville.length == 1) {
            System.out.println(-1);
        }
        boolean notSeven = true;
        while (notSeven) {
            Arrays.sort(scoville);
            scoville[1] = scoville[0] + (scoville[1] * 2);
            answer++;
            scoville = Arrays.copyOfRange(scoville, 1, scoville.length);
            if (scoville[0] > 7 || scoville.length == 1) {
                notSeven = false;
            }
        }
        System.out.println(answer);
    }
}
