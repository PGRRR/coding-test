package programmers.lv1;

import java.util.ArrayList;
import java.util.Comparator;

public class CodingTestMulNumberArray {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        ArrayList<Integer> answer = new ArrayList<>();
        int divisor = 5;
        for (int num : arr) {
            if (num % divisor == 0) {
                answer.add(num);
            }
        }
        if (answer.isEmpty()) {
            answer.add(-1);
        } else {
            answer.sort(Comparator.naturalOrder());
            System.out.println(answer);
        }
    }
}
