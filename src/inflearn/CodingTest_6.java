package inflearn;

import java.util.ArrayList;

public class CodingTest_6 {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 30, 40};
        int[] arr2 = {1, 4, 5, 6, 7, 8, 9, 10};
//        int[] arr3 = new int[arr1.length + arr2.length];
//        System.arraycopy(arr1, 0, arr3, 0, arr1.length);
//        System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
//        Arrays.sort(arr3);
//        System.out.println(Arrays.toString(arr3));
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]);
            } else {
                answer.add(arr2[p2++]);
            }
        }
        while (p1 < arr1.length) {
            answer.add(arr1[p1++]);
        }
        while (p2 < arr2.length) {
            answer.add(arr2[p2++]);
        }
        System.out.println(answer);
        }
    }
