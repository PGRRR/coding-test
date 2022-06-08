package programmers.lv2;

import java.util.Arrays;

public class CodingTestPhoneList {
    public static void main(String[] args) {
        String[] phone_book = {"12","123","1235","567","88"};
//        for (int i = 0; i < phone_book.length; i++) {
//            for (int j = 1; j < phone_book.length; j++) {
//                if (phone_book[i].length() < phone_book[j].length() && phone_book[j].startsWith(phone_book[i])) {
//                    System.out.println(false);
//                }
//            }
//        }
        Arrays.sort(phone_book);
        for (int i = 0; i < phone_book.length; i++) {
            if (i == phone_book.length - 1) {
                break;
            }
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                System.out.println(false);
                break;
            }
        }
        System.out.println(true);
    }
}
