package programmers.lv1;

import java.util.*;


public class CodingTestStringDescending {
    public static void main(String[] args) {
        String s = "Zbcdefg";
        char[] charArray = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char ch : charArray) {
            arrayList.add(ch);
        }
        arrayList.sort(Comparator.reverseOrder());
        int i = 0;
        for (char ch : arrayList) {
            charArray[i++] = ch;
        }
        String answer = new String(charArray);
        System.out.println(answer);
    }
}
