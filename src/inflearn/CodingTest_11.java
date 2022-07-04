package inflean;

public class CodingTest_11 {
    public static void main(String[] args) {

        int[] arr = {19, 15, 10, 17};
        int start = 0;
        int end = (int) 1e9;
        int result = 0;

        while (start <= end) {
            long total = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < 4; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }
            if (total < 6) {
                end = mid - 1;
            } else {
                result = mid;
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
