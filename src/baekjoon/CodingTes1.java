package baekjoon;

import java.util.Arrays;

public class CodingTes1 {
    public static void main(String[] args) {
        int[] grade = {10,2,20,0,30,5};
        int answer = -1;
        int sum = 0;
        for (int num : grade) {
            sum += num;
        }
        int temp = grade[0];
        for (int i = 1; i < grade.length; i++) {
            if (temp > grade[i]) {
                grade[i - 1] = grade[i];
                i--;
            }
            temp = grade[i];
            if (i >= 1  && grade[i] < grade[i - 1]) {
                i -= 2;
            }
        }
        int newSum = 0;
        for (int num : grade) {
            newSum += num;
        }
        answer = sum - newSum;
        System.out.println(Arrays.toString(grade));
        System.out.println(answer);
    }
}
