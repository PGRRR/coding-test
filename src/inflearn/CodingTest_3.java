package inflearn;

public class CodingTest_3 {
    public static void main(String[] args) {
        int num = 3;
        String one = "good";
        String two = "Time";
        String three = "Big";
        String[] strArr = {one, two, three};

        for (String tmp : strArr) {
            char[] chArr = new char[tmp.length()];
            for (int i = 0; i < tmp.length(); i++) {
                int len = tmp.length() - i - 1;
                chArr[len] = tmp.charAt(i);
            }
            String str = new String(chArr);
            System.out.println(str);
        }

        for (String tmp : strArr) {
            char[] ca = tmp.toCharArray();
            int lt = 0, rt = tmp.length() - 1;
            while (lt < rt) {
                char c = ca[lt];
                ca[lt] = ca[rt];
                ca[rt] = c;
                lt++;
                rt--;
            }
            String s = new String(ca);
            System.out.println(s);
        }

        StringBuilder sb1 = new StringBuilder(one);
        StringBuilder sb2 = new StringBuilder(two);
        StringBuilder sb3 = new StringBuilder(three);
        System.out.println(sb1.reverse());
        System.out.println(sb2.reverse());
        System.out.println(sb3.reverse());
    }
}
