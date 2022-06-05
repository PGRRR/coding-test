package programmers.lv1;

public class CodingTestStrangeString {
    public static void main(String[] args) {
        String s = "try hello world";
//        String[] split = s.split(" ");
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String str : split) {
//            for (int i = 0; i < str.length(); i++) {
//                if (i % 2 == 0) {
//                    stringBuilder.append((str.charAt(i) + "").toUpperCase());
//                } else {
//                    stringBuilder.append((str.charAt(i) + "").toLowerCase());
//                }
//            }
//            stringBuilder.append(" ");
//        }
//        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
//        System.out.println(stringBuilder.toString());
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                i = 0;
                stringBuilder.append(ch);
                continue;
            }
            if (i % 2 == 0) {
                stringBuilder.append((ch + "").toUpperCase());
            } else {
                stringBuilder.append((ch + "").toLowerCase());
            }
            i++;
        }
        System.out.println(stringBuilder);
    }
}
