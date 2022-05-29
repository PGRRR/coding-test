package inflean;

public class CodingTestNHN {
    public static void main(String[] args) {
        int[][] cards1 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        int[][] cards2 = {{5, 7, 9, 11, 13}, {11, 13, 15, 17, 19}};
        int answer = 0;
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < cards1[0].length; i++) {

           Out: for (int j = 0; j < cards2[0].length; j++) {

                for (int n = 0; n < cards1.length; n++) {

                    if (cards1[n][i] == cards2[n][j]) {
                        answer++;
                        break Out;
                    } else {
                        if (n != cards1.length-1){
                            if (cards2[n][i] == cards2[n+1][j]) {
                                d2++;
                                if (d2 >= 2) {
                                    answer++;
                                    break Out;
                                }
                            }
                            if (cards1[n][i] == cards1[n+1][j]) {
                                d1++;
                                if (d1 >= 2) {
                                    answer++;
                                    break Out;
                                }
                            }
                            if (cards1[n+1][i] == cards2[n+1][j]) {
                                answer++;
                                break Out;
                            }
                        }
                    }

                }

            }

        }
        System.out.println(answer);
    }
}
