package programmers.lv1;

public class CodingTestSissorPW {
    public static void main(String[] args) {
        String s = "abc";
        int n = 4;
        StringBuilder answer = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != ' ') {
                if ((ch + n) > 'z' && 'a' <= ch && ch <= 'z') {
                    answer.append((char) ('a' + (n - ('z' - ch) - 1)));
                } else if ((ch + n) > 'Z' && 'A' <= ch && ch <= 'Z') {
                    answer.append((char) ('A' + (n - ('Z' - ch) - 1)));
                } else {
                    answer.append((char) (ch + n));
                }
            } else {
                answer.append(' ');
            }
        }
        System.out.println(answer);
    }
}
