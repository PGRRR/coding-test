package programmers.lv1;

public class CodingTestHarshadNumber {
    public static void main(String[] args) {
        int x = 113;
        int a = x;
        int num = 0;
        while (x > 0) {
            num += x % 10;
            x /= 10;
        }
        boolean answer = a % num == 0;
        System.out.println(num);
        System.out.println(answer);
    }
}
