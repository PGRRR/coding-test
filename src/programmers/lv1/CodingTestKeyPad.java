package programmers.lv1;

public class CodingTestKeyPad {
    public static void main(String[] args) {
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
        int lp1 = 3;
        int lp2 = 0;
        int rp1 = 3;
        int rp2 = 2;
        double rLen = 0;
        double lLen = 0;
        StringBuilder answer = new StringBuilder();
        int[][] keyPad = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {-1, 0, -2}
        };
        for (int num : numbers) {
            switch (num) {
                case 1:
                    answer.append("L");
                    lp1 = 0;
                    lp2 = 0;
                    continue;
                case 4:
                    answer.append("L");
                    lp1 = 1;
                    lp2 = 0;
                    continue;
                case 7:
                    answer.append("L");
                    lp1 = 2;
                    lp2 = 0;
                    continue;
                case 3:
                    answer.append("R");
                    rp1 = 0;
                    rp2 = 2;
                    continue;
                case 6:
                    answer.append("R");
                    rp1 = 1;
                    rp2 = 2;
                    continue;
                case 9:
                    answer.append("R");
                    rp1 = 2;
                    rp2 = 2;
                    continue;
                case 2:
                    rLen = Math.sqrt(Math.abs(Math.pow(rp1, 2) - Math.pow(rp2, 2)) + 1);
                    lLen = Math.sqrt(Math.abs(Math.pow(lp1, 2) - Math.pow(lp2, 2)) + 1);
                    if (rLen > lLen) {
                        answer.append("L");
                        lp1 = 0;
                        lp2 = 1;
                    } else if (rLen < lLen) {
                        answer.append("R");
                        rp1 = 0;
                        rp2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            lp1 = 0;
                            lp2 = 1;
                        } else {
                            answer.append("R");
                            rp1 = 0;
                            rp2 = 1;
                        }
                    }
                    continue;
                case 5:
                    rLen = Math.sqrt(Math.abs(Math.pow(rp1, 2) - Math.pow(rp2, 2)));
                    lLen = Math.sqrt(Math.abs(Math.pow(lp1, 2) - Math.pow(lp2, 2)));
                    if (rLen > lLen) {
                        answer.append("L");
                        lp1 = 1;
                        lp2 = 1;
                    } else if (rLen < lLen) {
                        answer.append("R");
                        rp1 = 1;
                        rp2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            lp1 = 1;
                            lp2 = 1;
                        } else {
                            answer.append("R");
                            rp1 = 1;
                            rp2 = 1;
                        }
                    }
                    continue;
                case 8:
                    rLen = Math.sqrt(Math.abs(Math.pow(rp1, 2) - Math.pow(rp2, 2)) + 3);
                    lLen = Math.sqrt(Math.abs(Math.pow(lp1, 2) - Math.pow(lp2, 2)) + 3);
                    if (rLen > lLen) {
                        answer.append("L");
                        lp1 = 2;
                        lp2 = 1;
                    } else if (rLen < lLen) {
                        answer.append("R");
                        rp1 = 2;
                        rp2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            lp1 = 2;
                            lp2 = 1;
                        } else {
                            answer.append("R");
                            rp1 = 2;
                            rp2 = 1;
                        }
                    }
                    continue;
                case 0:
                    rLen = Math.sqrt(Math.abs(Math.pow(rp1, 2) - Math.pow(rp2, 2)) + 8);
                    lLen = Math.sqrt(Math.abs(Math.pow(lp1, 2) - Math.pow(lp2, 2)) + 8);
                    if (rLen > lLen) {
                        answer.append("L");
                        lp1 = 3;
                        lp2 = 1;
                    } else if (rLen < lLen) {
                        answer.append("R");
                        rp1 = 3;
                        rp2 = 1;
                    } else {
                        if (hand.equals("left")) {
                            answer.append("L");
                            lp1 = 3;
                            lp2 = 1;
                        } else {
                            answer.append("R");
                            rp1 = 3;
                            rp2 = 1;
                        }
                    }
                    continue;

            }
        }
        System.out.println(answer);
    }
}
