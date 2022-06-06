package programmers.lv1;

public class CodingTestSquareRoot {
    public static void main(String[] args) {
        long n = 3;
        long i = 0;
        long pow = 0;
        do {
            pow = (long) Math.pow(++i, 2);
            if (i > n) {
                System.out.println(-1);
                break;
            }
        }
        while (pow != n);
        long answer = (long) Math.pow((i + 1), 2);
        System.out.println(answer);
    }
}
