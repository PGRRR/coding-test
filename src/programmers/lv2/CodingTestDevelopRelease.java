package programmers.lv2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CodingTestDevelopRelease {
    public static void main(String[] args) {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = new int[progresses.length];
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
while (progresses[progresses.length-1] != 100){
            for (int i = 0; i < progresses.length; i++) {
                if (!(progresses[i] >= 100)) {
                    progresses[i] += speeds[i];
                } else {
                    if (progresses[0] == 100) {
                        for (int tmp : progresses) {
                            queue.offer(tmp);
                        }
                        while (queue.poll() >= 100) {
                            answer[0] += 1;
                        }
                        stack.push(answer[0]);
                    }
                }
            }
        }
        System.out.println(stack);
    }
}
