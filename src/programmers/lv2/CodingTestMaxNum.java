package programmers.lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class CodingTestMaxNum {
    public static void main(String[] args) {
        int[] numbers = {6, 10, 2};
        ArrayList<String> arrayList = new ArrayList<>();
        for (int num : numbers) {
            arrayList.add(num + "");
        }
        StringBuilder stringBuilder = new StringBuilder();
        String max = "0";
        while (!arrayList.isEmpty()) {
            for (String str : arrayList) {
                if (str.charAt(0) == max.charAt(0)) {
                }
                if (str.charAt(0) > max.charAt(0)) {
                    max = str;
                }
            }
            stringBuilder.append(max);
            arrayList.remove(max);
            max = "0";
        }
        System.out.println(stringBuilder);
    }
}
