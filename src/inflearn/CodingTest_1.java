package inflearn;

import java.util.Scanner;

public class CodingTest_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        int count = 0;
//        for (int i = 0; i < s1.length(); i++) {
//            if (s1.charAt(i) == s2.charAt(0)) {
//                count++;
//            }
//        }
        for (char x : str1.toCharArray()) {
            if (x == s2.charAt(0)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
