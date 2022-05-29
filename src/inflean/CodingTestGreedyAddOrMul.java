package inflean;

import java.util.Arrays;

public class CodingTestGreedyAddOrMul {
    public static void main(String[] args) {
        String str = "567";
        char[] toCharArray = str.toCharArray();
        int max = 0;
        Arrays.sort(toCharArray);
        for (char ch : toCharArray) {
            if (ch < '0') {
                continue;
            }
            if (max == 0 || ch == '1') {
                max += ch - 48;
            } else {
                max *= ch - 48;
            }
        }
        System.out.println(max);
    }
}

