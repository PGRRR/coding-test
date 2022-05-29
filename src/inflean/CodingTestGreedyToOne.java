package inflean;

public class CodingTestGreedyToOne {
    public static void main(String[] args) {
        int n = 25;
        int k = 3;
        int count = 0;
        while (n != 1) {
            if (n % k == 0) {
                n /= k;
                count++;
            } else {
                n -= 1;
                count++;
            }
        }
        System.out.println(count);
    }
}
