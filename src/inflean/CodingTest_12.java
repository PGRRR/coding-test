package inflean;

public class CodingTest_12 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int a = 2;
        int count = 0;
        for (int num : arr) {
            if (num == a) {
                count++;
            }
        }
        System.out.println(count);
    }
}
