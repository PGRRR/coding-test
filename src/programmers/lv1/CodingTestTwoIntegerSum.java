package programmers.lv1;

public class CodingTestTwoIntegerSum {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        long answer = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                answer += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
