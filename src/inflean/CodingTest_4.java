package inflean;

import java.util.Arrays;

public class CodingTest_4 {
    public static void main(String[] args) {
        int[] arr = new int[7];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < 7; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }

        int a = 1, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 7; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
