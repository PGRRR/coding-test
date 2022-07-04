package baekjoon;

import java.util.Arrays;
import java.util.Optional;

public class CodingTest2 {
    public static void main(String[] args) {
        int n = 4;
        boolean horizontal = true;
        int[][] answer = {};
        answer = new int[n][n];
        int count = 1;
        answer[0][0] = count;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (answer[i][j] != 0) {
                    break;
                }
                if (horizontal) {
                    answer[i][j] = count++;
                } else {
                    answer[j][i] = count++;
                }
                int max = Math.max(i, j);
                for (int k = 0; k < max; k++) {
                    for (int l = 0; l < max; l++) {
                        if (answer[k][l] == 0) {
                            horizontal = !horizontal;
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(answer));
    }
}
