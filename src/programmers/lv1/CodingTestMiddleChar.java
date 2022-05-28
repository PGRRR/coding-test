package programmers.lv1;

public class CodingTestMiddleChar {
    public static void main(String[] args) {
        String s = "abcde";
        int half = s.length() / 2;
        if (s.length() % 2 == 0) {
            System.out.print(s.charAt(half-1));
            System.out.print(s.charAt(half));
        } else {
            System.out.println(s.charAt(half));
        }
    }
}
