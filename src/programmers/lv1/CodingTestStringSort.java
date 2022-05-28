package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;

public class CodingTestStringSort {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;
        char[] chars = new char[strings.length];
        String[] answer = new String[strings.length];
        HashMap<Integer, Character> hashMap = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            hashMap.put(i, strings[i].charAt(n)); // map 1=u 2=e 3=a
            chars[i] = strings[i].charAt(n); // chars {u,e,a}
        }
        Arrays.sort(chars); // chars {a,e,u}
        for (int i = chars.length-1; i >= 0; i--) {
            for (int j = 0; j < hashMap.size(); j++) {
                if (chars[i] == hashMap.get(j)) {
                    answer[i] = strings[j];
                    hashMap.replace(j, ' ');
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
        System.out.println(hashMap);

    }
}
