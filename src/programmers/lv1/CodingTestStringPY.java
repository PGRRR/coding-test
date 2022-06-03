package programmers.lv1;

import java.util.Objects;

public class CodingTestStringPY {
    public static void main(String[] args) {
        String s = "pPoooyY";
        s = s.toLowerCase();
        int p = 0, y = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'p') {
                p++;
            } else if (ch == 'y') {
                y++;
            }
        }
        boolean answer = p == y;

    }

}