package programmers.lv1;

import java.util.ArrayList;

public class CodingTestGym {
    public static void main(String[] args) {
        String s = "a234";
        String s1 = "1234";
        if (!(s.length() == 4 || s.length() == 6)) {
            System.out.println(false);
        }
            for (char ch : s.toCharArray()) {
                if (!('0' <= ch && ch <= '9')) {
                    System.out.println(false);
                } else {
                    System.out.println(true);
                }
            }
        }
//        for (int i = 0; i < s.length(); i++) {
//            if (!('0' <= s.charAt(i) && s.charAt(i) <= 9)) {
//
////            }
//
//        }
//
//    }
}
