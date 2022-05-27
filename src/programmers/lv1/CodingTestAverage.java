package programmers.lv1;

public class CodingTestAverage {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double answer = (double) sum / arr.length;
        System.out.println(answer);
    }
}

