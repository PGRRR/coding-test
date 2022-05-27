package inflean;

import java.util.Arrays;

public class CodingTest_5 {
    public static void main(String[] args) {
//        int[][] arr = new int[5][5];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = (int) (Math.random() * 100);
//            }
//        }
//        System.out.println(Arrays.deepToString(arr));
        int[][] arr = {
                {5, 1, 1, 1, 1},
                {1, 5, 1, 1, 1},
                {1, 1, 100, 1, 1},
                {8, 1, 1, 5, 1},
                {7, 2, 1, 1, 5}
        };
        int max = 0;
        int sum1, sum2;
        for (int i = 0; i < arr.length; i++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
//            if (max < sum1) {
//                max = sum1;
//            }
//            if (max < sum2) {
//                max = sum2;
//            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
        }
        sum1 = 0;
        sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][arr.length - i - 1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);
        System.out.println(max);
    }
}
