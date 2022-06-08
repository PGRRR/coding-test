package programmers.lv2;

public class CodingTestDecimalFind {
    public static void main(String[] args) {
        String numbers = "17";
        int num = 0;
        for (int i = 0; i < numbers.length(); i++) {
            for (int j = 0; j < numbers.length(); j++) {
                num = numbers.charAt(i) - 48 + numbers.charAt(j) - 48;
            }
        }
    }
}
