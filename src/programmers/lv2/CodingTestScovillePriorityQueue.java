package programmers.lv2;

import java.util.PriorityQueue;

public class CodingTestScovillePriorityQueue {
    public static int main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;
        int count = 0;
        int answer = 0;
        PriorityQueue queue = new PriorityQueue();
        for (int i = 0; i < scoville.length; i++) {
            queue.add(scoville[i]);
        }
        while (true) {
            if (queue.size() == 1) {
                return -1;
            }
            int first = (int) queue.poll();
            int second = (int) queue.poll();

            int newSco = first + (second * 2);
            queue.add(newSco);

        }
    }
}
