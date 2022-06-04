package programmers.lv1;

public class CodingTestCollatz {
    public static void main(String[] args) {
        long num = 626331;
        int answer = 0;
        while (num != 1) {
            if (answer == 500) {
                System.out.println(-1);
                break;
            } else if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
