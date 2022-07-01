package inflearn;

public class CodingTestTimeThree {
    public static void main(String[] args) {
        int count = 0;
        int N = 5;
        String time = "";
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    time = "" + i + j + k;
                    if (time.contains("3")) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}

