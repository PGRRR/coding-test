package programmers.lv1;

import java.util.HashSet;

public class CodingTestPhonecketMon {
    public static void main(String[] args) {
        int answer = 0;
        int[] nums = {3, 3, 3, 2, 2, 4};
        int chance = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (chance <= set.size()) {
            answer = chance;
        } else {
            answer = set.size();
        }
        System.out.println(answer);
    }
}
