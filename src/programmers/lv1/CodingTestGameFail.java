package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class CodingTestGameFail {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] answer = new int[N];
        double[] fail = new double[N];
        HashMap<Integer, Double> hashMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int failUser = 0;
            int passUser = 0;
            for (int j = 0; j < stages.length; j++) {
                if (i - 1 < stages[j] && stages[j] <= i) {
                    failUser += 1;
                }
                if (stages[j] >= i) {
                    passUser += 1;
                }
            }
            if (failUser == 0) {
                hashMap.put(i, 0.0);
                fail[i - 1] = 0.0;
            } else {
                hashMap.put(i, (double) failUser / passUser);
                fail[i - 1] = (double) failUser / passUser;
            }
        }
        Arrays.sort(fail);
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 1; j <= N; j++) {
                if (fail[i] == hashMap.get(j)) {
                    answer[Math.abs(i - N) - 1] = j;
                    hashMap.replace(j, -1.0);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));

    }

}
