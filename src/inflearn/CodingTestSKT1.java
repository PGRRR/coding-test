package inflearn;

import java.util.Arrays;

public class CodingTestSKT1 {
    public static void main(String[] args) {
        int[] p = {2, 5, 3, 1, 4};
        int[] answer = new int[p.length];
        int min = Integer.MAX_VALUE;
        int tmp = 0;
        for (int i = 0; i < p.length; i++) {
            for (int j = i; j < p.length; j++) {
                if (p[j] < min) {
                    min = p[j];
                    tmp = j;
                }
            }
            if (min != p[i]) {
                p[tmp] = p[i];
                p[i] = min;
                answer[i] += 1;
                answer[tmp] +=1;
            }
            min = Integer.MAX_VALUE;
        }
        System.out.println(Arrays.toString(answer));
    }
}
