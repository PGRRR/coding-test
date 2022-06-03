package programmers.lv1;

public class CodingTestAddDigit {
    public static void main(String[] args) {
        int n = 123;
        int answer = 0;
        String str = Integer.toString(n);
        for (char ch : str.toCharArray()) {
            answer += ch-48;
        }
        System.out.println(answer);
    }
}
