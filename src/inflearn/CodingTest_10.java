package inflean;

import java.util.Arrays;

public class CodingTest_10 {
    public static void main(String[] args) {
        int[] ints = {19, 15, 10, 17};
        int maxNum = 0;
        int answer = 0;
        for (int num : ints) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        while (answer != 6) {
            answer = 0;
            --maxNum;
            for (int num : ints) {
                if (num > maxNum) {
                    answer += num - maxNum;
                }
            }
        }
        System.out.println(maxNum);
    }
}
