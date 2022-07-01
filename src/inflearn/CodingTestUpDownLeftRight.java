package inflearn;

public class CodingTestUpDownLeftRight {
    public static void main(String[] args) {
        int N = 5;
        int p1 = 1;
        int p2 = 1;
        String[] strArr = {"R", "R", "R", "U", "D", "D"};
        for (int i = 0; i < strArr.length; i++) {
            switch (strArr[i]) {
                case "R":
                    if (p2 != 5) {
                        p2++;
                    }
                    break;
                case "L":
                    if (p2 != 1) {
                        p2--;
                    }
                    break;
                case "U":
                    if (p1 != 1) {
                        p1--;
                    }
                    break;
                case "D":
                    if (p1 != 5) {
                        p1++;
                    }
                    break;
            }
        }
        System.out.println(p1 + " " + p2);
    }

}
