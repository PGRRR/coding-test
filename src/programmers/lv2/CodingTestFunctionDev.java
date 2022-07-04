package programmers.lv2;

import java.util.*;

public class CodingTestFunctionDev {
    public static void main(String[] args) {
        int[] progresses = {100, 99, 100};
        int[] speeds = {1, 1, 1};
        int count = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (progresses.length != 0) {
            while (progresses[0] < 100) {
                for (int i = 0; i < progresses.length; i++) {
                    progresses[i] += speeds[i];
                }
            }
            for (int num : progresses) {
                if (num < 100) {
                    break;
                }
                count++;
            }
            answer.add(count);
            progresses = Arrays.copyOfRange(progresses, count, progresses.length);
            speeds = Arrays.copyOfRange(speeds, count, speeds.length);
            count = 0;
        }

        System.out.println(answer);
    }
}

