package programmers.lv1;

import java.util.Calendar;

public class CodingTest2016 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a - 1, b);
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                System.out.println("SUN");
                break;
            case 2:
                System.out.println("MON");
                break;
            case 3:
                System.out.println("TUE");
                break;
            case 4:
                System.out.println("WED");
                break;
            case 5:
                System.out.println("THU");
                break;
            case 6:
                System.out.println("FRI");
                break;
            case 7:
                System.out.println("SAT");
                break;
        }
    }
}
