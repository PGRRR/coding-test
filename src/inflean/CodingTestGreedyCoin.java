package inflean;

public class CodingTestGreedyCoin {
    public static void main(String[] args) {
        int n = 1260;
        int count = 0;
        int[] arr = {500, 100, 50, 10};

        for (int coin : arr) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }


}
