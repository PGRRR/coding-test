package inflean;

import java.util.HashMap;
import java.util.Map;

public class CodingTest_7 {
    public static void main(String[] args) {
        String str = "BACBACCACCBDEDE";
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char tmp : str.toCharArray()) {
            hashMap.put(tmp, hashMap.getOrDefault(tmp, 0) + 1);
        }
        System.out.println(hashMap.containsKey('A'));
        char answer = ' ';
        int max = 0;
        for (char k : hashMap.keySet()) {
            System.out.println(k + " " + hashMap.get(k));
            if (hashMap.get(k) > max) {
                max = hashMap.get(k);
                answer = k;
            }
        }
        System.out.println(answer);
    }
}
