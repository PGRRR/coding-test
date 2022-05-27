package programmers.lv1;

public class CodingTestPhoneNumber {
    public static void main(String[] args) {
        String phone_number = "01051516454";
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < phone_number.length() - 4; i++) {
            answer.append("*");
        }
        answer.append(phone_number.substring(phone_number.length() - 4));
        System.out.println(answer);
    }
}
