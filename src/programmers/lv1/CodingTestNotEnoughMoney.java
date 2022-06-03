package programmers.lv1;

public class CodingTestNotEnoughMoney {
    public static void main(String[] args) {
        int price = 3;
        int money = 30;
        int count = 4;
        long answer = -1;
        for (int i = 1; i <= count; i++) {
            money -= price * i;
        }
        answer = (money < 0) ? Math.abs(money) : 0;
        System.out.println(answer);
    }

}
