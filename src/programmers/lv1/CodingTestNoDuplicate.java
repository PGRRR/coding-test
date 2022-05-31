package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class CodingTestNoDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int num : arr) {
            if (stack.peek() != num) {
                stack.push(num);
            }
        }
        int[] answer = new int[stack.size()];
        int i = 0;
        for (int num : stack) {
            answer[i++] = num;
        }
        System.out.println(Arrays.toString(answer));
    }
}
