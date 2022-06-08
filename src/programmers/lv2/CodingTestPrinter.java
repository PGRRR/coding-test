package programmers.lv2;

import java.util.*;

public class CodingTestPrinter {
    public static void main(String[] args) {
        int[] priorities = {1, 1, 1, 1, 1, 1};
        int location = 0;
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        for (int num : priorities) {
            queue.offer(num);
        }
        while (!queue.isEmpty()) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                if (queue.peek() < (int) it.next()) {
                    queue.offer(queue.poll());
                    if (location == 0) {
                        location = queue.size() - 1;
                    } else {
                        location--;
                    }
                    break;
                }
            }
            if (location == 0) {
                System.out.println(answer);
            } else {
                location--;
            }
            queue.poll();
            answer++;
        }
    }
}


