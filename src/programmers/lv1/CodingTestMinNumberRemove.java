package programmers.lv1;

import java.util.ArrayList;

public class CodingTestMinNumberRemove {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        int min = arr[0];

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        for (int num : arr) {
            if (num != min) {
                arrayList.add(num);
            }
        }

        if (arrayList.isEmpty()) {
            arrayList.add(-1);
        }

        System.out.println(arrayList);

    }
}
