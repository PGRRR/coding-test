package inflearn;

import java.util.Arrays;

public class CodingTestSKT2 {
    public static void main(String[] args) {
        int[] periods = {20, 23, 24};
        int[][] payments = {
                {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000, 100000},
                {350000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000, 50000}
        };
        int[] estimates = {100000, 100000, 100000};
        int[] answer = new int[2];
        boolean[] thisVip = new boolean[periods.length];
        boolean[] nextVip = new boolean[periods.length];
        int[] thisMonth = new int[periods.length];
        int[] nextMonth = new int[periods.length];
        for (int i = 0; i < payments.length; i++) {
            for (int j = 0; j < payments[i].length; j++) {
                thisMonth[i] += payments[i][j];
            }
            nextMonth[i] += thisMonth[i] + estimates[i] - payments[i][0];
            if (24 <= periods[i] && periods[i] < 60 && thisMonth[i] >= 900000) {
                thisVip[i] = true;
            } else if (60 <= periods[i] && thisMonth[i] >= 600000) {
                thisVip[i] = true;
            }
            if (24 <= periods[i] + 1 && periods[i] + 1 < 60 && nextMonth[i] >= 900000) {
                nextVip[i] = true;
            } else if (60 <= periods[i] + 1 && nextMonth[i] + 1 >= 600000) {
                nextVip[i] = true;
            }
            if (thisVip[i] == false && nextVip[i] == true) {
                answer[0]++;
            } else if (thisVip[i] == true && nextVip[i] == false) {
                answer[1]++;
            }
        }
        System.out.println(Arrays.toString(thisMonth));
        System.out.println(Arrays.toString(nextMonth));
        System.out.println(Arrays.toString(answer));

    }
}
