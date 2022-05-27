package programmers.lv1;

public class CodingTestWaterMelon {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = 4;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }
        String answer = String.valueOf(sb);
        System.out.println(sb);
    }
}
