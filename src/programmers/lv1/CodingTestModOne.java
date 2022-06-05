package programmers.lv1;

public class CodingTestModOne {
    public static void main(String[] args) {
        int n = 10;
        int answer = 1;
        while (n % answer != 1) {
            answer++;
        }
        System.out.println(answer);
    }
}
